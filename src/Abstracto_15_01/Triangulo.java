package Abstracto_15_01;

public class Triangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcular_area() {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
    }

    @Override
    public double calcular_perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String mostrarInfo() {
        return "Triángulo con lados: " + lado1 + ", " + lado2 + ", " + lado3;
    }
}

