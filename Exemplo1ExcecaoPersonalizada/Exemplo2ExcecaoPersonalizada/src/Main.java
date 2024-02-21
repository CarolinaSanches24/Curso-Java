public class Main {
    public static void main(String[] args) {

        try{
            throw new ExcecaoCustomizada("Operação Inválida!");
        }catch (ExcecaoCustomizada e){
            System.out.println(e.getMessage());
        }
    }
}