import Clases.Hilo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            list.add((int) (Math.random() * 13) + 3);
        }

        Hilo thread1 = new Hilo("A", list);
        Hilo thread2 = new Hilo("B", list);
        Hilo thread3 = new Hilo("C", list);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
