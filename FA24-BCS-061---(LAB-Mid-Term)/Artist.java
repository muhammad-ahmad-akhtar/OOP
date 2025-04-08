public class Artist extends Person{

	String genre;

	public Artist(String name, String genre) {
		super(name);
		this.genre = genre;
	}

	@Override
	public String toString() {
		return this.name + " has " + this.genre + " in genre.";
	}

}