package Clases;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public String toString() {
        return "Rectangulo con base " + base + " y altura " + altura;
    }
}
