package taller11.ejercicio3;

public class PruebaAbstracta {
    public static void main(String[] args) {
        // Animal es abstracta, así que no podemos crear un Animal directamente
        // En cambio, sí podemos crear un Gato que hereda de Animal

        Animal gato = new Gato("Michi");
        gato.hacerSonido();
    }
}
