public class App {

    public static void main(String[] args) {

        Ejecutor miEjecutor = new Ejecutor("Ejecutor1");
        Ejecutor miEjecutor2 = new Ejecutor("Ejecutor2");
        Ejecutor miEjecutor3 = new Ejecutor("Ejecutor3");

        Thread miThread = new Thread(miEjecutor);
        Thread miThread2 = new Thread(miEjecutor2);
        Thread miThread3 = new Thread(miEjecutor3);

        miThread.start();
        miThread2.start();
        miThread3.start();

        try {
            miThread.join();
            miThread2.join();
            miThread3.join();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("Al terminar contadorPrincipal vale: " + Contador.getContadorPrincipal());

    }

}
