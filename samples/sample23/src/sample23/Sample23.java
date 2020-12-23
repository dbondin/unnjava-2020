package sample23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

public class Sample23 {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setTitle("Sample23");
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		JButton b = new JButton("Button");
		b.setEnabled(false);
		frame.getContentPane().add(b);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello");
				System.out.println(e);
			}
		});
		
		JCheckBox cb = new JCheckBox("CheckBox");
		frame.getContentPane().add(cb);
		
		cb.addActionListener((e) -> {
				b.setEnabled(cb.isSelected());
			}
		);
		
		JComboBox<String> co = new JComboBox<>(new String[] {"one", "two", "three"});
		frame.getContentPane().add(co);
		
		
		
		//JWindow w =  new JWindow(frame);
		//w.setSize(100, 100);
		
		//w.setVisible(true);
		
		JPanel p = new JPanel();
		p.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouse clicked on my pane");
			}
		});
		p.setBorder(BorderFactory.createLineBorder(Color.red));
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		p.setLayout(new FlowLayout());
		
		p.add(t1);
		p.add(t2);
		p.add(t3);
		
		frame.getContentPane().add(p);
		
		JTextArea ta = new JTextArea(80, 80);
		JScrollPane sp = new JScrollPane(ta);
		sp.setPreferredSize(new Dimension(100, 100));;
		
		frame.getContentPane().add(sp);
		
		final List<String> list = new ArrayList<>();
		try(BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("listmodel.txt"))))
		{
			while(true) {
				String str = r.readLine();
				if(str == null) {
					break;
				}
				list.add(str);
			}
		}
		
		
		AbstractListModel<String> lm1 = new AbstractListModel<String>() {
			
			@Override
			public int getSize() {
				return list.size();
			}
			
			@Override
			public String getElementAt(int index) {
				return list.get(index);
			}
		};
		
		JList<String> l1 = new JList<>();
		l1.setModel(lm1);
		JScrollPane spl1 = new JScrollPane(l1);
		spl1.setPreferredSize(new Dimension(100, 100));
		frame.getContentPane().add(spl1);
		
		final List<Student> list2 = Arrays.asList(new Student("Dmitry", "Bondin", "96-AM"),
				new Student("John", "Doe", "unknown"),
				new Student("Jane", "Miller", "unknown"));
		
		ListModel<Student> lm2 = new AbstractListModel<Student>() {
			@Override
			public Student getElementAt(int index) {
				return list2.get(index);
			}
			
			@Override
			public int getSize() {
				return list2.size();
			}
		};
		
		JList<Student> l2 = new JList<>();
		l2.setModel(lm2);
		JScrollPane spl2 = new JScrollPane(l2);
		spl2.setPreferredSize(new Dimension(100, 100));
		frame.getContentPane().add(spl2);
		
		l2.addListSelectionListener((e) -> {
			for(Student s :  ((JList<Student> )e.getSource()).getSelectedValuesList())
			{
				System.out.println(s.getGroup());
			}
		});
		
		ImageIcon ii = new ImageIcon(Sample23.class.getResource("/sample23/student.gif"));
		
		l2.setCellRenderer(new ListCellRenderer<Student>() {
			
			JLabel c = new JLabel();
			
			@Override
			public Component getListCellRendererComponent(JList<? extends Student> list, Student value, int index,
					boolean isSelected, boolean cellHasFocus) {
				c.setText(value.getFirstName() + " / " + value.getLastName());
				c.setBackground(isSelected ? Color.red : Color.white);
				c.setOpaque(true);
				c.setIcon(ii);
				
				return c;
			}
		});
		
		JTable tbl = new JTable();
		DefaultTableModel tblm = new DefaultTableModel(new Object[] {"col-1", "col-2", "col-3"}, 100);
		tbl.setModel(tblm);
		JScrollPane tblsp = new JScrollPane(tbl);
		tblsp.setPreferredSize(new Dimension(300, 200));
		
		frame.getContentPane().add(tblsp);
		
		JPanel p2 = new JPanel();
		p2.setBorder(BorderFactory.createLineBorder(Color.yellow));
		p2.setLayout(new BorderLayout());
		p2.add(new JButton("button-1"), BorderLayout.NORTH);
		p2.add(new JButton("button-2"), BorderLayout.SOUTH);
		p2.add(new JButton("button-3"), BorderLayout.WEST);
		p2.add(new JButton("button-4"), BorderLayout.EAST);
		p2.add(new JButton("button-5"), BorderLayout.CENTER);
		p2.setPreferredSize(new Dimension(300, 200));
		frame.getContentPane().add(p2);
		
		JPanel p3 = new JPanel();
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		p3.setLayout(new GridBagLayout());
		JButton b1 = new JButton("button-1");
		JButton b2 = new JButton("button-2");
		p3.add(b1, new GridBagConstraints(0, 0, 1, 2, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(0, 0, 0 , 0), 0, 0));
		p3.add(b2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0 , 0), 0, 0));
		p3.add(new JButton("button-3"), new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0 , 0), 0, 0));
		//p3.add(new JButton("button-4"), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0 , 0), 0, 0));
		p3.add(new JButton("button-5"), new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0 , 0), 0, 0));
		//p3.add(new JButton("button-6"), new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0 , 0), 0, 0));
		p3.setPreferredSize(new Dimension(300, 200));
		frame.getContentPane().add(p3);
		
		JMenuBar mb = new JMenuBar();
		JMenu mFile = new JMenu("File");
		JMenuItem mFileExit = new JMenuItem("Exit", KeyEvent.VK_X);
		mFileExit.addActionListener((e) -> System.exit(0));
		mFile.add(mFileExit);
		mb.add(mFile);
		frame.setJMenuBar(mb);
		
		b1.addActionListener(e -> {
			
			int result = JOptionPane.showConfirmDialog(frame, "Continue?", "Warning", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(frame, "Cool");
			}
		});
		
		b2.addActionListener(e -> {
			Runnable r =new Runnable() {
				
				@Override
				public void run() {
					SwingUtilities.invokeLater(() -> b2.setEnabled(false));
					for(int i=0; i<15; ++i) {
						System.out.println(i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					SwingUtilities.invokeLater(() -> b2.setEnabled(true));
				}
			};
			new Thread(r).start();
		});
		
		frame.setVisible(true);
	}
}
