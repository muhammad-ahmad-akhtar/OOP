public class Playlist {

	String title;
	String genre;
	Track[] tracks = new Track[5];
	int indexOfTrack = 0;

	public Playlist(String title, String genre, Track[] tracks) {
		this.title = title;
		this.genre = genre;
		this.tracks = tracks;
	}

	public void addTrack(Track t) {
		tracks[indexOfTrack] = t;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Playlist: " + this.title + " (" + this.genre + ")");
		for(int i = 0; i < 1; i++) {
			str.append("\n - " + this.title + " (ID: T001" + ")  - Name: <to be done>");
		}
		return str.toString();
	}

}