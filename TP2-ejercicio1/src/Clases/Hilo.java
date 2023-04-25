package Clases;

import java.util.Random;

public class Hilo extends Thread {
    private String name;

    public Hilo(String name) {
        this.name = name;
    }

    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int iteration = random.nextInt(31) + 10;
            int delay = random.nextInt(950) + 50;
            System.out.println("Este es el hilo " + name + " y esta es la iteración " + i + ": " + iteration);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

