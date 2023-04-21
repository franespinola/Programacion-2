package Clases;

public class Cuadrado implements FiguraGeometrica {
    private double lado;
    private double ubicacionX;
    private double ubicacionY;

    public Cuadrado(double lado, double ubicacionX, double ubicacionY) throws IllegalArgumentException {
        if (lado < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        this.lado = lado;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    // getters y setters

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularSuperficie() {
        return Math.pow(lado, 2);
    }

    public String toString() {
        return "Cuadrado de lado " + lado + " y ubicación (" + ubicacionX + ", " + ubicacionY + ")";
    }
}
