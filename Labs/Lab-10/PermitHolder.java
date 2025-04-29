public class PermitHolder extends Person{
    int id;
    private static int count = 1000;

    public PermitHolder(String name) {
        super(name);
        this.id = count++;
    }
}
