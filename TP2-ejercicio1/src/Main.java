import Clases.Hilo;
import Clases.RunnableHilo;

public class Main {
    public static void main(String[] args) {
       Hilo[] hilo1 = new Hilo[4];
        for (int i = 0; i < hilo1.length; i++) {
            hilo1[i] = new Hilo("Thread " + (i + 1));
            hilo1[i].start();
        }

        RunnableHilo[] hilo2 = new RunnableHilo[4];
        for (int i = 0; i < hilo2.length; i++) {
            hilo2[i] = new RunnableHilo("Thread " + (i + 1), 10, 500);
            new Thread(hilo2[i]).start();
        }
    }
}
