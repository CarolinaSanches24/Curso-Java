import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\vmaur\\Documents\\arquivo.txt";
        System.out.println("\nContéudo do arquivo texto:\n");

        try{
            FileReader arquivo = new FileReader(path);
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            String linha = lerArquivo.readLine(); //ler primeira linha
            while(linha!=null){ // enquanto a linha nao estiver vazia
                System.out.println(linha);
                linha = lerArquivo.readLine(); // ler da segunda a ultima linha
            }
            lerArquivo.close();
        }catch(IOException e){
            System.out.println("Erro na leitura do Arquivo" + e);
        }
    }
}