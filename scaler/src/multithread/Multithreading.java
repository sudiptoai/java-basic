package multithread;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass tc = new ThreadClass();
        Thread t1 = new Thread(tc);
        Thread t2 = new Thread(tc);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        tc.display();
    }
}
