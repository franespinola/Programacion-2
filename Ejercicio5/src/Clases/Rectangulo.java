package Clases;

public class Rectangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double ubicacionX;
    private double ubicacionY;

    public Rectangulo(double lado1, double lado2, double ubicacionX, double ubicacionY) throws IllegalArgumentException {
        if (lado1 < 0 || lado2 < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    // getters y setters

    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public double calcularSuperficie() {
        return lado1 * lado2;
    }

    public String toString() {
        return "Rectángulo de lados " + lado1 + " y " + lado2 + " y ubicación (" + ubicacionX + ", " + ubicacionY + ")";
    }
}
