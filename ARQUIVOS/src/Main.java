import java.io.File;
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de um arquivo com seu path: \n");
        String nome = teclado.next();

        File objFile = new File(nome);
        if(objFile.exists()){ //se o arquivo existe
            if(objFile.isFile()){ // se for um arquivo
                System.out.println("Nome do Arquivo: "+objFile.getName());
                System.out.println("Tamanho do Arquivo: "+objFile.length());

            }

        }else{
            System.out.println("Arquivo Inexistente");
        }
    }
}