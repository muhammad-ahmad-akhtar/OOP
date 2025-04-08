public class Main {

	public static void main(String[] args) {
		//MusicLibrary: String name, String libName, int numofYears, RegisteredListeners[] listeners
		//MusicLibrary musicLibrary= new MusicLibrary("TuneVault", "Sana Ahmad", 4, listeners);

		RegisteredListener listener1 = new RegisteredListener("Hassan Ali");
		RegisteredListener listener2 = new RegisteredListener("Maria Rafiq");

		RegisteredListener[] listeners = {listener1, listener2};


		// Artist: String name, String genre
		Artist a1 = new Artist("Ayaan Malik", "Pop");
		Artist a2 = new Artist("Zara Khan", "Indie");

		//Track: String title, String trackId, Artist artist
		Track t1 = new Track("Track1", "T001", a1);
		Track t2 = new Track("Track2", "T002", a2);
		Track t3 = new Track("Track3", "T003", a2);
		Track t4 = new Track("Track3", "T004", a2);
		Track t5 = new Track("Track3", "T005", a2);

		Track[] tracks = {t1, t2, t3, t4, t5};

		//Playlist: String title, String genre, Track[] tracks
		Playlist playlist1 = new Playlist("Morning Chill", "Pop", tracks);
		Playlist playlist2 = new Playlist("Morning Dawn", "Pob", tracks);

		System.out.println();
		System.out.println(playlist1);

		System.out.println();
		System.out.println("----Registered Listeners-----");
		System.out.println(listener1);
		System.out.println(listener2);

		System.out.println();
		System.out.println("----Track Comparison-----");
		System.out.println("Are T001 and T002 equal? " + t1.equals(t2));
		
		System.out.println();
		System.out.println("----Listener Comparison-----");
		System.out.println("Are 101 and 102 equal? " + listener1.equals(listener2));

	}
}