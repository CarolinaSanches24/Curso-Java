public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("JavaWorld");

        //exclui uma parte da sequência de caracteres do StringBuilder.

        sb.delete (4, 8); // excluir
        sb.insert(0,"Power"); // inserir (index , obj);
        sb.replace(9,18,"developer");//substituir
        sb.reverse(); //reverte a string
        sb.setCharAt(3,'x');// adiciona um caracter posição especifica

        System.out.println(sb.toString());


    }
}