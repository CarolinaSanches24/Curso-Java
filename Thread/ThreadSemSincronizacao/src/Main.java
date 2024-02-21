public class Main {
    private static int contador = 0;

    public static void main(String[] args) {
        // Criando e iniciando a primeira thread
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    // Incrementando o contador
                    contador++;
                }
            }
        });

        // Criando e iniciando a segunda thread
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    // Incrementando o contador
                    contador++;
                }
            }
        });

        // Iniciando as threads
        thread1.start();
        thread2.start();

        // Aguardando as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exibindo o valor final do contador
        System.out.println("Valor final do contador: " + contador);
    }
}