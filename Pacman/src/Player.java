import javax.swing.JOptionPane;

public class Player {

	private int lives;
	private int xAxis; 
	private int yAxis; 
	private String ImagePath; 
	private boolean isAlive;
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String imagePath) {
		if(imagePath == null)
			JOptionPane.showMessageDialog(null, "invalid string");
		else if(imagePath.length() == 0)
			JOptionPane.showMessageDialog(null, "string empty");
		else 
		this.ImagePath = imagePath;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Player(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive) {
		super();
		this.setLives(lives);
		this.setAlive(isAlive);
		this.setImagePath(imagePath);
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
	} 
	
}
