package Clases;

public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Circulo con radio " + radio;
    }
}
