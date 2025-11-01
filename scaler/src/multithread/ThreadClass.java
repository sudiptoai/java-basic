package multithread;

public class ThreadClass implements Runnable {
    private int counter;
    private final Object mutex = new Object();
    @Override
    public void run() {
        synchronized (mutex) {
            counter++;
        }
    }
    void display(){
        System.out.println("counter="+counter);
    }
}
