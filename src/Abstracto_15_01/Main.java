package Abstracto_15_01;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Triangulo
        FiguraGeometrica miTriangulo = new Triangulo(6, 7, 3);

        // Llamar a los métodos de la interfaz
        double area = miTriangulo.calcular_area();
        double perimetro = miTriangulo.calcular_perimetro();
        String info = miTriangulo.mostrarInfo();

        // Imprimir resultados
        System.out.println(info);
        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);

    }
}

