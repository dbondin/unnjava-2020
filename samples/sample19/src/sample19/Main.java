package sample19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = new ByteArrayInputStream(new byte[] {123, 23, 31, 40});
		while(true) {
			
			int nextByte = -1;
			
			try {
				nextByte = is.read();
			}
			catch(IOException ex)
			{
				ex.printStackTrace(System.err);
				break;
			}
			
			if(nextByte == -1) {
				break;
			}
			System.out.println("nextByte = " + nextByte);
		}
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		try {
			os.write(123);
			os.write("Hello".getBytes());
		}
		catch(IOException  ex)
		{
			ex.printStackTrace(System.err);
		}
		
		byte [] ba = os.toByteArray();
	
		for(byte b : ba) {
			System.out.println("next byte = " + b);
		}
		
		ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(baos2);

		try {
			bos.write("Hello World".getBytes());
		}
		catch(IOException ex) { ex.printStackTrace(); }
		
		System.out.println("size = " + baos2.toByteArray().length);
		
		try {
			bos.flush();
		}
		catch(IOException ex) { ex.printStackTrace(); }
		System.out.println("size = " + baos2.toByteArray().length);

		DataInputStream das = new DataInputStream(new ByteArrayInputStream(new byte[] {0, 0, 1, 1, 12, 43})); // 0x00000101 == b00000000.00000000.00000001.00000001 256 + 1 == 257 ??
		int i = das.readInt();
		System.out.println("i = " + i);
		short s = das.readShort(); // 2 bytes 12, 43 == 00001100 00101011 4+8 1+2+8+32 12*256+43 = 3115?
		System.out.println("s = " + s);

		objectStreamTest();
		
		printStreamTest();
		
		fileStreamTest();
		
		readerWriterTest();
		
		// System`.in     STDIN       cin      0
		// System.out    STDOUT      cout     1
		// System.err    STDERR      cerr     2
		
		// sysInTest();
		
		fileStreamTest2();
		
		int x = 0;
		
		
		x = 1;
		
		assert x == 0; // Run with -ae flag to make it working
		
		System.out.println(sin(1));
		
		System.loadLibrary("sample19_A");
		
		A a = new A();
		a.fn1();
		a.fn2();
	}

	private static void fileStreamTest2() {
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test5.out");
		
			fos.write("Hello".getBytes()); if(true) throw new IOException();// let's imagine IOExcepion is here		
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("closing file");
			try {
				if(fos != null) {
					fos.close();
				}
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		
		try(FileOutputStream fos2 = new FileOutputStream("test5.out")) {
			fos2.write("Hello".getBytes());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void sysInTest() throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is youe age: ");
		
		int age = s.nextInt();
				
		if(age > 18) {
			System.out.println("Hello where");
		}
		else {
			System.out.println("Go to school, you are too young to be here : )))");
		}
	}

	private static void readerWriterTest() throws Exception {
		
		Writer w = new FileWriter("test4.out");
		
		w.write("Hello World \u20AC");
		
		w.close();
	}

	private static void fileStreamTest() throws Exception {
		
		FileOutputStream fos = new FileOutputStream("test1.out");
		
		fos.write(0);
		fos.write(1);
		fos.write(2);
		fos.write("HELLO".getBytes());
		
		fos.close();
		
		FileOutputStream fos2 = new FileOutputStream("test2.out", true);
		PrintStream ps2 = new PrintStream(fos2);
		
		ps2.println("Hello Java");
		ps2.println("My name is Dmitry");
		
		fos2.close();
		
		FileInputStream fis = new FileInputStream("test1.in");
		while(true) {
			int b = fis.read();
			if(b == -1) {
				break;
			}
			System.out.write(b);
		}
		fis.close();
		System.out.flush();
		
//		FileOutputStream fos3 = new FileOutputStream("test3.out");
//		ObjectOutputStream oos3 = new ObjectOutputStream(fos3);
//		
//		A a = new A(123, 2.7, "Hello Java");
//		
//		oos3.writeObject(a);
//		
//		fos3.close();
		
		FileInputStream fis2 = new FileInputStream("test3.out");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		A otherA = (A) ois2.readObject();
		System.out.println("otherA = " + otherA);
		
		RandomAccessFile raf = new RandomAccessFile("testra.dat", "r");
		raf.seek(4);
		int i = raf.readInt();
		raf.close();
		System.out.println(i);
		
		
	}

	private static void printStreamTest() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		
		ps.println("Hello World");
		ps.println(123);
		
		ps.format("%s %s %d", "str1", "str2", 444);
	}

	private static void objectStreamTest() throws IOException, ClassNotFoundException {
		A a = new A(10, 3.14, "Java", 13);
		System.out.println("a=" + a);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(a);
		
		byte [] ba = baos.toByteArray();
		
		for(byte b : ba) {
		//	System.out.println("oos byte: " + b);
		}
		
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(ba));
		Object o = ois.readObject();
		if(o instanceof A) {
			A otherA = (A) o;
			System.out.println("This is A!!! " + otherA);
		}
		else {
			System.out.println("This is NOT an A : (((");
		}
	}
}
