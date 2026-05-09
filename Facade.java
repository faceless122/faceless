package house;

import java.awt.Color;

public class Facade {
	private int x, y, width, height;
	private Window[] windows; // aggregation
	private Color color;
	
	public Facade(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		windows = new Window[1];
		int windowStartX = x + (width/2);
		int windowStartY = y + (height/2);
		int windowW = width/4;
		int windowH = height/5;
		windows[0] = new Window(windowStartX, windowStartY, windowW, windowH);
		
		color = new Color(30, 255, 30);
	}
	
	public Window detachWindow() {
		Window tempWindow = windows[0];
		windows = null;
		return tempWindow;
	}
	
	public void draw() {
		Color oldColor = Canvas.PEN.getColor();
		
		Canvas.PEN.setColor(color);
		Canvas.PEN.fillRect(x, y, width, height);
		
		for(int i = 0; i < windows.length; i++) {
			if ( theWindowIsStillThere(i) ) {
				windows[i].draw();
			}
		}
		
		Canvas.PEN.setColor(oldColor);
	}
	
	private boolean theWindowIsStillThere(int i) {
		return windows[i] != null;
	}

	public void attachAWindow(Window aDetachedWindow) {
		Window[] temp = new Window[windows.length+1];
		for(int i = 0; i < windows.length; i++) {
			temp[i] = windows[i];
		}
		windows = temp;
		aDetachedWindow.setNewWidth(x + (width/4), y + (height/5), width/4);
		windows[windows.length-1] = aDetachedWindow;
	}
}
