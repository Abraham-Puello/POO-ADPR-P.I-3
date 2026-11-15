package taller11.ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
    }
}
