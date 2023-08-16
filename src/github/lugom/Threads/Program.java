package github.lugom.Threads;

public class Program
{
    public static void main(String[] args)
    {
        final int NUM_THREADS = 5;
        MyThread[] t = new MyThread[NUM_THREADS];

        // cria as threads
        for (int i = 0; i < NUM_THREADS; i++) {
        t[i] = new MyThread (i);
        }

        // inicia a execução das threads
        for (int i = 0; i < NUM_THREADS; i++) {
        t[i].start () ;
        }

    }
}
