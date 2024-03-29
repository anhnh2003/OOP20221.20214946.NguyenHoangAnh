package hust.soict.cybersec.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public DigitalVideoDisc(String title, String category, float cost, int length) {
        super(title, category, cost, length);
    }

	// public void swap(DigitalVideoDisc dvd) {
	//	super.setTitle(dvd.getTitle());
	//	super.setCategory(dvd.getCategory());
	//	this.director = dvd.getDirector();
	//	this.length = dvd.getLength();
	//	super.setCost(dvd.getCost());
	//	setID(dvd.getID());
	//}

	public void play() {
		if (Integer.compare(this.getLength(), 0) == 0) {
				System.out.println("The media you entered cannot be played.");
				return;
		}
		System.out.println("Playing DVD: "+this.getTitle());
		System.out.println("DVD length: "+this.getLength());
	}
}