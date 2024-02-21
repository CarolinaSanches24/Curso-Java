public class Main {
    public static void main(String[] args) {

        MinhaThreadRunnable minhaThread = new MinhaThreadRunnable();
        Thread thread = new Thread(minhaThread);
        thread.start();
        System.out.println("Thread Principal");
    }
}