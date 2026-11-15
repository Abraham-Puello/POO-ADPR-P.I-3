package taller13.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 3);
        Figura triangulo = new Triangulo(5, 3);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
