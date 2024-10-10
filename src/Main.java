//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("hilo número 1");
        Hilo hilo2 = new Hilo("hilo número 2");

        // b) hazlo con prioridades
        hilo2.setPriority(Thread.MAX_PRIORITY); // Prioridad más alta para hilo 2
        hilo1.setPriority(Thread.MIN_PRIORITY); // Prioridad más baja para hilo 1


        hilo2.start(); // Primero empieza hilo2
        try {
            hilo2.join(); // hilo1 esperará a que termine hilo2
        } catch (InterruptedException e) {
            System.err.println("error al ejecutar "+hilo2.getName());
        }

        hilo1.start();
        try {
//Cuando no hago al programa esperar al hilo1 suele ocurrir que termina antes que el hilo1...
            hilo1.join(); // Programa va a esperar a que termine hilo1
        } catch (InterruptedException e) {
            System.err.println("error al ejecutar "+hilo2.getName());
        }





        System.out.println("Ambos hilos han terminado su ejecución.");
    }
}