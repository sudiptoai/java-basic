package interfaceAndAbstruct;

public abstract class ClientAbstruct {
    protected String name;
    public ClientAbstruct(String name) {
        this.name = name;
    }

    protected void displayName() {
        System.out.println("Name: " + this.name);
    }

    protected abstract void whoIsIt();
}
