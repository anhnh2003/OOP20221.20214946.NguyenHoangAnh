package hust.soict.cybersec.aims.disc;

import hust.soict.cybersec.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

	public void play() throws PlayerException {
		if (Integer.compare(this.getLength(), 0) <= 0) {
			throw new PlayerException("The track cannot be played because the length is invalid.");
		}
		System.out.println("Playing track: "+this.getTitle());
		System.out.println("Track length: "+this.getLength());
	}

    public boolean equals(Object o) {
        if (o instanceof Track) {
            if (this.title == ((Track)o).title && this.length == ((Track)o).length) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}