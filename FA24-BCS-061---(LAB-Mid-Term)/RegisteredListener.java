public class RegisteredListener extends Person {

	int listenerId;
	private static int count = 100;

	public RegisteredListener(String name) {
		super(name);
		this.listenerId = ++count;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", " + "Listener ID: " + this.listenerId;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj == null){ return false; }
		if(!(obj instanceof RegisteredListener)) { return false; }

		RegisteredListener other = (RegisteredListener) obj;
		
		return this.listenerId == other.listenerId;
	}
}