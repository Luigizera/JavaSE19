package github.lugom.Threads;

public class MyThread extends Thread {
    int threadID;
    private static final int NUM_THREADS = 5;

    MyThread(int ID) {
        threadID = ID;
    }

    // corpo de cada thread
    public void run() {
        System.out.println(threadID + ": Hello World!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadID + ": Bye bye World!");
    }
}