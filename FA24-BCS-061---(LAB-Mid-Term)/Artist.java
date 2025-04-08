public class Artist extends Person{

	String genre;

	public Artist(String name, String genre) {
		super(name);
		this.genre = genre;
	}

	@Override
	public String toString() {
		return " - Name: " + this.name + ", Genre: " + this.genre;
	}

}