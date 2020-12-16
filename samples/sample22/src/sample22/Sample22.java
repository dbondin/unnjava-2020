package sample22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Sample22 {
	
	private static void myfunc(Collection<?> c) {
		System.out.println("my collection has " + c.size() + " elements");
	}
	
	private static void print(String prefix, Collection<?> c) {
		Iterator<?> i = c.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			System.out.println(prefix + " " + o);
		}
	}
	
	private static void print2(String prefix, Collection<?> c) {
		for(Object o : c)
		{
			System.out.println(prefix + " " + o);
		}
	}
	
	public static void main(String[] args) {
		myfunc(new ArrayList<>());
		myfunc(new HashSet<>());
		
		// All the collections are GENERICS -> not primitives in the collections
		// NO List<int>, only List<Integer>
		
		List<Integer> li = Arrays.asList(4, 6, 2, 9, 4, 7, 1, 0, 6);
		System.out.println("li.size = " + li.size());
		System.out.println("li.get(3) = " + li.get(3));
		// li.add(3, 100); - UnsupportedOperationException
		print(">", li);
		
		Set<String> ss = new HashSet<>();
		ss.add("hello");
		ss.add("world");
		ss.add("java");
		ss.add("abc");
		ss.add("world");
		
		print2(">>", ss);
		
		SortedSet<String> sss = new TreeSet<>();
		sss.add("hello");
		sss.add("world");
		sss.add("java");
		sss.add("abc");
		sss.add("world");
		sss.add("block");
		
		for(String s : sss) {
			System.out.println(">>> " + s);
		}
		
		NavigableSet<String> nss = new TreeSet<>();
		nss.add("hello");
		nss.add("world");
		nss.add("java");
		nss.add("abc");
		nss.add("world");
		nss.add("block");
		
		String w = "dan";
		String end = nss.ceiling("java");
		while(true) {
			w = nss.higher(w);
			if(w == null) {
				break;
			}
			System.out.println(">>>> " + w);
			if(w.equals(end)) {
				break;
			}	
		}
		
		//FIFO
		Queue<Double> qd = new LinkedList<>();
		qd.offer(1.0);
		qd.offer(2.0);
		qd.offer(3.0);
		
		System.out.println(qd.poll());
		System.out.println(qd.poll());
		System.out.println(qd.poll());
		System.out.println(qd.poll()); // null here
		
		//FIFO or LIFO (stack)
		Deque<Character> stack = new LinkedList<>();
		String str = "NavigableSet<String> nss = new TreeSet<>();";
		for(int i=0; i<str.length(); ++i) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
		
		List<String> mls = new MyOwnList();
		for(String s : mls) {
			System.out.println("?? " + s);
		}
		
		ArrayList<String> als = new ArrayList<>();
		for(int i=0; i<100; ++i) {
			als.add("hello");
		}
		System.out.println(als.size());
		
		PriorityQueue<Message> pq = new PriorityQueue<>((a, b) -> a.getPriority() - b.getPriority());
		pq.add(new Message(10, "hello"));
		pq.add(new Message(5, "where is my money?"));
		pq.add(new Message(10, "bye"));
		pq.add(new Message(0, "the roof is on fire !!!"));
		
		while(!pq.isEmpty() ) {
			System.out.println("message: " + pq.poll());
		}
		
		Map<String, Integer> m = new HashMap<>();
		m.put("www.google.com", 10);
		m.put("www.bing.com", 6);
		m.put("www.yahoo.com", 2);
		
		System.out.println("m " + m.get("www.yahoo.com"));
		
		for(String k : m.keySet()) {
			System.out.println("k=" + k + "; v=" + m.get(k));
		}
		
		for(Map.Entry<String, Integer> e : m.entrySet()) {
			System.out.println("k=" + e.getKey() + "; v=" + e.getValue());
		}
		
		Map<Cat, Integer> mc = new HashMap<>();
		
		mc.put(new Cat("Tom", 20), 1);
		mc.put(new Cat("Barus", 5), 6);
		
		print2("mc", mc.entrySet());
		
		mc.put(new Cat("Tom", 20), 10);
		
		print2("mc2", mc.entrySet());
		
		TreeMap<Cat, Integer> tmc = new TreeMap<>();
		
		tmc.put(new Cat("Tom", 20), 1);
		tmc.put(new Cat("Barus", 5), 6);
		
		print2("tmc", tmc.entrySet());
		
		tmc.put(new Cat("Tom", 20), 10);
		
		print2("tmc2", tmc.entrySet());
		
		List<Integer> li2 = Arrays.asList(5, 3, 76, 32, 54, 7, 23, 65, 76, 23, 76, 32, 7, 9, 50);
		System.out.println(Collections.min(li2));
		Collections.swap(li2, 3, 7);
		print("li2", li2);
		
		// Try to not to use Vector, Stack, Hashtable ...
		Vector<String> v= new Vector<>(); // ArrayList
		v.add("hello");
		v.add("world");
		print("v", v);
	}
}
