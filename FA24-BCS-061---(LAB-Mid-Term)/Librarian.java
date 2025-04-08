public class Librarian extends Person{

	int yearsOfService;

	public Librarian(String name, int yearsOfService) {
		super(name);
		this.yearsOfService = yearsOfService;
	}

	@Override
	public String toString() {
		return "Librarian: Name: " + this.name + ", Years of Service: " + this.yearsOfService + "\n";
	}
}