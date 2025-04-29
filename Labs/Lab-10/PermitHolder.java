public class PermitHolder extends Person{
    int id;
    private static int count = 1000;

    public PermitHolder(String name) {
        super(name);
        this.id = count++;
    }

    public int getPermitId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Permit ID: " + id;
    }    

}
