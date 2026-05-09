package house;

public class House {
	private Facade facade; // composite
	private Roof roof; // composite
	
	public House(int left, int top, int width, int height) {
		int roofHeight = height/3;
		facade = new Facade(left, top, width, height - roofHeight);
		roof = new Roof(left, top, width, roofHeight);
	}
	
	public Window detachWindow() {
		return facade.detachWindow();
	}
	
	public void draw() {
		facade.draw();
		roof.draw();
	}

	public void attachAWindow(Window aDetachedWindow) {
		facade.attachAWindow(aDetachedWindow);
	}
}
