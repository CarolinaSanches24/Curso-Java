public class estruturaRepeticaoFor {
    public static  void main(String[]args){
        for(int cont=0;cont<10; cont++){
            System.out.print(cont);
            try {
                // Pausa a execução por 1000 milissegundos (1 segundo)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
