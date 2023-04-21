import Clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> listaFiguras = new ArrayList<>();

        try {
            listaFiguras.add(new Circulo(5, 1, 1));
            listaFiguras.add(new Triangulo(3, 4, 5, 2, 2));
            listaFiguras.add(new Rectangulo(4, 6, 3, 4));
            listaFiguras.add(new Cuadrado(2, 5, 6));
            listaFiguras.add(new Pentagono(3, 7, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        for (FiguraGeometrica figura : listaFiguras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
    }
}
