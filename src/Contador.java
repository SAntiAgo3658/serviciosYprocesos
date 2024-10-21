// import java.util.concurrent.locks.ReentrantLock;

public class Contador {

    private static int contadorPrincipal = 0;
    private int contandorIndividual;
    // private static ReentrantLock cerrojo = new ReentrantLock();

    public Contador() {
        this.contandorIndividual = 0;

    }

    public static int getContadorPrincipal() {
        // cerrojo.lock();
        int contadortemp = contadorPrincipal;
        // cerrojo.unlock();
        return contadortemp;

    }

    public int getContandorIndividual() {
        return contandorIndividual;

    }

    public static void incrementarContadorPrincipal() {
        // cerrojo.lock();
        contadorPrincipal++;
        // cerrojo.unlock();

    }

    public void incrementarContadorIndividual() {
        contandorIndividual++;

    }

}
