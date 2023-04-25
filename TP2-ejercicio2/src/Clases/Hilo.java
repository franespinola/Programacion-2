package Clases;

import java.util.List;

public class Hilo extends Thread {
    private String name;
    private List<Integer> list;

    public Hilo(String name, List<Integer> list) {
        this.name = name;
        this.list = list;
    }

    public void run() {
        System.out.println("Hilo " + name + " procesando la lista.");
        while (!list.isEmpty()) {
            int value = list.remove(0);
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            System.out.println("Hilo " + name + " procesando la lista. Valor a calcular: " + value + ". Resultado: " + result + ". Quedan " + list.size() + " elementos en la lista por procesar.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hilo " + name + " ha terminado de procesar la lista.");
    }
}

