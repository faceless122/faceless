package house;

public class Application {
	private House[] hotels;
	private House aNewOne;
	private int numOfHotels = 1;

	public Application() {
		hotels = new House[numOfHotels];
		for (int i = 0; i < numOfHotels; i++) {
			int left = (20 * i^2) + i*80 + 200;
			int top = 300;
			int width = 400;
			int height = 120 + (36 * (i+1));
			hotels[i] = new House(left, top, width, height);
		}
		changeFirstHotel();
	}

	private void changeFirstHotel() {
		removeAWindow();
	}
	
	public void removeAWindow() {
		Window aDetachedWindow = hotels[0].detachWindow();
		hotels[0] = null;
		System.out.println(aDetachedWindow.getInfo());
		
		System.out.println("Now attach window to new house: ");
		aNewOne = new House(600, 400, 100, 100);
		aNewOne.attachAWindow(aDetachedWindow);
	}
	
	public void draw() {
		for (int i = 0; i < numOfHotels; i++) {
			if ( hotels[i] != null ) {
				hotels[i].draw();
			}
		}
		if ( aNewOne != null) {
			aNewOne.draw();
		}
	}
}