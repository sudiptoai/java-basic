package interfaceAndAbstruct;

public class Client extends ClientAbstruct implements ClientInterface {
    public Client(String name) {
        super(name);
    }

    @Override
    public void whatCanDo() {
        System.out.println("interface");
    }
    @Override
    public void whoIsIt() {
        System.out.println("abstract");
    }
    public static void main(String[] args) {
        Client client = new Client("abstruct name");
        client.whatCanDo();
        client.whoIsIt();
        client.displayName();
    }

}

