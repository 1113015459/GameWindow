import javax.swing.JFrame;
import java.awt.HeadlessException;
import javax.swing.JMenuBar;

public class Game extends JFrame {
	JMenuBar bar;
	public static void main(String[] args) {
		new Game();
	}
	public Game() throws HeadlessException{
		super();
		bar = new JMenuBar();
		setJMenuBar(bar);
		this.setSize(400,300);
		this.setVisible(true);
	}
}