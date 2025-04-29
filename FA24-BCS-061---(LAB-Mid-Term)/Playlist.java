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
		str.append("Playlist: " + this.title + " (" + this.genre + ")\n");
		for(int i = 0; i < tracks.length; i++) {
			str.append(tracks[i].toString());
			str.append("\n");
		}
		return str.toString();
	}

}