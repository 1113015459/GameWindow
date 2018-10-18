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

		menuGame = new JMenu("游戏");
		menuGame.addActionListener(this);

		menuHelp = new JMenu("帮助");
		menuHelp.addActionListener(this);

		contact = new JMenu("联系我们");
		test = new JMenu("测试");

		start = new JMenuItem("开始游戏");
		start.addActionListener(this);
		start.setBackground(Color.white);

		open = new JMenuItem("关闭游戏");
		open.addActionListener(this);

		about = new JMenuItem("关于我们");
		about.addActionListener(this);

		personal = new JMenuItem("个人中心");
		phone = new JMenuItem("联系电话");
		
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