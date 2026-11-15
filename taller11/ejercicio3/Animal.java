package taller11.ejercicio3;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Este metodo no es abstracto, por eso Gato no tiene que cambiarlo
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }
}
