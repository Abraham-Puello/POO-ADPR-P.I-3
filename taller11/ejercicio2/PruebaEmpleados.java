package taller11.ejercicio2;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("María", 5000000, 1500000);
        Empleado vendedor = new Vendedor("Carlos", 1800000, 20000000, 0.05);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
