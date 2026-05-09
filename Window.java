package house;

import java.awt.Color;

public class Window {
	private int x, y;
	private int width, height;
	
	public Window(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Canvas.PEN.setColor(Color.BLUE);
		Canvas.PEN.fillRect(x, y, width, height);
	}
	
	public String getInfo() {
		return "x: " + x + " y: " + y + " width: " + width + " height: " + height;
	}

	public void setNewWidth(int newXPos, int newYPos, int w) {
		x = newXPos;
		y = newYPos;
		width = w;
	}
}
