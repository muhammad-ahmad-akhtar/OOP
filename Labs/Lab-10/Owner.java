public class Owner extends Person{

    public Owner(String name) {
        super(name);
    }

    public Owner(Owner owner) {
        super(owner.getName());
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null){ return false; }
        if(!(obj instanceof Owner)) { return false; }

        Owner other = (Owner) obj;

        return this.getName().equals(other.getName());
    }
}
