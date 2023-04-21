package Clases;

public class Pentagono implements FiguraGeometrica {
    private double lado;
    private double ubicacionX;
    private double ubicacionY;

    public Pentagono(double lado, double ubicacionX, double ubicacionY) throws IllegalArgumentException {
        if (lado < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        this.lado = lado;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    // getters y setters

    public double calcularPerimetro() {
        return 5 * lado;
    }

    public double calcularSuperficie() {
        return (lado * lado * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }

    public String toString() {
        return "Pentágono de lado " + lado + " y ubicación (" + ubicacionX + ", " + ubicacionY + ")";
    }
}
