import javax.swing.JPanel;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Level1 extends JPanel{
	private JFrame window = new JFrame("�Packman");
	private  ImageIcon iamgeBackground = new ImageIcon("images//background.png");
	
	public Level1() {
		
		window.add(this);
		window.setSize(1200,950);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
@Override	public void paint(Graphics g) {
		g.drawImage(iamgeBackground.getImage(), 0, 0, null);
	}

}
