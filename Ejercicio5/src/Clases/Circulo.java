package Clases;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double ubicacionX;
    private double ubicacionY;

    public Circulo(double radio, double ubicacionX, double ubicacionY) throws IllegalArgumentException {
        if (radio < 0 || ubicacionX < 0 || ubicacionY < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        this.radio = radio;
        this.ubicacionX = ubicacionX;
        this.ubicacionY = ubicacionY;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws IllegalArgumentException {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo.");
        }
        this.radio = radio;
    }

    public double getUbicacionX() {
        return ubicacionX;
    }

    public void setUbicacionX(double ubicacionX) throws IllegalArgumentException {
        if (ubicacionX < 0) {
            throw new IllegalArgumentException("La ubicación en el eje X no puede ser negativa.");
        }
        this.ubicacionX = ubicacionX;
    }

    public double getUbicacionY() {
        return ubicacionY;
    }

    public void setUbicacionY(double ubicacionY) throws IllegalArgumentException {
        if (ubicacionY < 0) {
            throw new IllegalArgumentException("La ubicación en el eje Y no puede ser negativa.");
        }
        this.ubicacionY = ubicacionY;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Círculo de radio " + radio + " y ubicación (" + ubicacionX + ", " + ubicacionY + ")";
    }
}
