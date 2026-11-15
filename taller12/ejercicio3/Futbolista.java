package taller12.ejercicio3;


// Si quitamos jugar(), Java marcaría un error porque Jugador lo exige
public class Futbolista implements Jugador {
    @Override
    public void jugar() {
        System.out.println("El futbolista juega fútbol.");
    }
}
