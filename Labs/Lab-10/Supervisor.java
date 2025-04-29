public class Supervisor extends Person {
    int numOfYears;

    public Supervisor(String name, int numOfYears) {
        super(name);
        this.numOfYears = numOfYears;
    }

    public int getNumOfYears() {
        return numOfYears;
    }

    public void setNumOfYears(int numOfYears) {
        this.numOfYears = numOfYears;
    }

    @Override
    public String toString() {
        return "Supervisor: " + super.getName() + ", Experience: " + numOfYears + " years";
    }
}