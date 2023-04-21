package Clases;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double ubicacionX;
    private double ubicacionY;

    public Triangulo(double lado1, double lado2, double lado3, double ubicacionX, double ubicacionY) throws IllegalArgumentException {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    // getters y setters

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSuperficie() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    public String toString() {
        return "Triángulo de lados " + lado1 + ", " + lado2 + " y " + lado3 + " y ubicación (" + ubicacionX + ", " + ubicacionY + ")";
    }
}

