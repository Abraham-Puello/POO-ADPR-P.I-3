package taller11.ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.print("Círculo -> ");
        circulo.mostrarArea();
        System.out.print("Rectángulo -> ");
        rectangulo.mostrarArea();
    }
}
