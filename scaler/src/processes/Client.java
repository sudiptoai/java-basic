package processes;

public class Client extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Client is running"+ Thread.currentThread().getName());
    }
}
