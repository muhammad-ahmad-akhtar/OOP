public class MusicLibrary {

	String name;
	Librarian librarian;
	Playlist[] playlists = new Playlist[2];
	RegisteredListener[] listeners = new RegisteredListener[2];
	int indexOfPlaylists = 0;
	int indexOfListeners = 0;

	public MusicLibrary(String name, String libName, int numOfYears, RegisteredListener[] listeners) {
		this.name = name;
		this.librarian = new Librarian(libName, numOfYears);
		this.listeners = listeners;
	}

	public void addPlaylist(Playlist p) {
		this.playlists[indexOfPlaylists] = p;
		indexOfPlaylists++;
	}
	
	public void addListener(RegisteredListener l) {
		this.listeners[indexOfListeners] = l;
		indexOfListeners++;
	}

	@Override
	public String toString() {
		return "Music Library: " + this.name + "\n" + librarian.toString();
	}
}