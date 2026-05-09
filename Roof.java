package house;

public class Roof {
	private int x0, y0, x1, y1, x2;
	
	public Roof(int x0, int y0, int width, int height) {
		this.x0 = x0;
		this.y0 = y0;
		x1 = x0 + (width/2);
		y1 = y0 - height;
		x2 = x1 + (width/2);
	}
	
	public void draw() {
		Canvas.PEN.drawLine(x0, y0, x1, y1);
		Canvas.PEN.drawLine(x1, y1, x2, y0);
	}

}
