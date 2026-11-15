package taller12.ejercicio3;

// Se puede implementar Movible aunque no tenga mucho sentido para una casa
public class Casa implements Movible {
    @Override
    public void moverse() {
        System.out.println("Las casas no se mueven.");
    }
}
