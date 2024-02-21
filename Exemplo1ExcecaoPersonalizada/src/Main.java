public class Main {
    public static void main(String[] args) {
    try{
        ClasseFilha filha = new ClasseFilha();

        filha.executar();
    }catch (Exception e){
        System.out.println("Erro" + e.getMessage());
    }

    }
}