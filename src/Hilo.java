
class Hilo extends Thread {
    public Hilo(String nombre) {
        super(nombre); // Llama al constructor de Thread con el nombre del hilo
    }

    @Override
    public void run() {
        System.out.println("Hola, soy el " + getName());
    }
}