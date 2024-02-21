import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\vmaur\\Documents\\arquivo.dat";
        try{
            FileInputStream arquivoInput = new FileInputStream(path);
            DataInputStream lerArquivo = new DataInputStream(arquivoInput);

            while(lerArquivo.available()>0){
                String matricula = lerArquivo.readUTF();
                String nome = lerArquivo.readUTF();
                double teste = lerArquivo.readDouble();
                double prova = lerArquivo.readDouble();
                int faltas = lerArquivo.readInt();

                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome: " + nome);
                System.out.println("Nota do teste: " + teste);
                System.out.println("Nota da prova: " + prova);
                System.out.println("Faltas: " + faltas);
                System.out.println("--------------------------");
            }
            lerArquivo.close();
        }catch(IOException e){
            System.out.println("Erro na leitura do arquivo" + e.getMessage());
        }finally {
            System.out.println("----fim do programa ----");
        }

    }
}