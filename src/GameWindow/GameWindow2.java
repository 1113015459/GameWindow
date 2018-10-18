package GameWindow;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameWindow2 extends JFrame implements ActionListener {
	JMenuBar bar;
	JMenu menuGame, menuHelp, contact, test;
	JMenuItem start, open, about, personal, phone;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameWindow2();
	}

	public GameWindow2() throws HeadlessException {
		super();

		bar = new JMenuBar();

		menuGame = new JMenu("��Ϸ");
		menuGame.addActionListener(this);

		menuHelp = new JMenu("����");
		menuHelp.addActionListener(this);

		contact = new JMenu("��ϵ����");
		test = new JMenu("����");

		start = new JMenuItem("��ʼ��Ϸ");
		start.addActionListener(this);
		start.setBackground(Color.white);

		open = new JMenuItem("�ر���Ϸ");
		open.addActionListener(this);

		about = new JMenuItem("��������");
		about.addActionListener(this);

		personal = new JMenuItem("��������");
		phone = new JMenuItem("��ϵ�绰");
		
		contact.add(personal);
		contact.addSeparator();
		contact.add(test);
		test.add(phone);

		menuGame.add(start);
		menuGame.addSeparator();
		menuGame.add(contact);
		menuGame.addSeparator();
		menuGame.add(open);
		
		menuHelp.add(about);
		

		bar.add(menuGame);
		bar.add(menuHelp);
		bar.setBackground(Color.yellow);

		this.setJMenuBar(bar);
		this.setSize(800, 600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		// TODO Auto-generated constructor stub  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}