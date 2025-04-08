public class Track {

	String title;
	String trackId;
	Artist artist;
	
	public Track(String title, String trackId, Artist artist) {
		this.title = title;
		this.trackId = trackId;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "  - \"" + this.title + "\"  (ID: " + this.trackId + ")" + artist.toString();
	}

	@Override
	public boolean equals(Object obj) {

		if(obj == null){ return false; }
		if(!(obj instanceof Track)) { return false; }

		Track other = (Track) obj;
		
		return this.trackId.equals(other.trackId);
	}


}