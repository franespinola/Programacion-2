package Clases;

import java.util.Random;

public class RunnableHilo implements Runnable {
    private String name;
    private int iterations;
    private int delay;

    public RunnableHilo(String name, int iterations, int delay) {
        this.name = name;
        this.iterations = iterations;
        this.delay = delay;
    }

    public void run() {
        Random random = new Random();
        for (int i = 1; i <= iterations; i++) {
            int iteration = random.nextInt(31) + 10;
            System.out.println("Este es el hilo " + name + " y esta es la iteración " + i + ": " + iteration);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

