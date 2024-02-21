
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.DataOutputStream;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;
        String path = "C:\\Users\\vmaur\\Documents\\arquivo.dat";
        FileOutputStream arquivo = null;
        DataOutputStream gravarArquivo = null;

        try{
            // Verifica se o arquivo existe e é um arquivo regular
            File objFile = new File(path);
            System.out.println("Digite sua matricula: ");
            matricula = teclado.next();

            System.out.println("Digite seu nome: ");
            nome = teclado.next();

            System.out.println("Digite seu teste: ");
            teste = teclado.nextDouble();

            System.out.println("Digite sua prova: ");
            prova = teclado.nextDouble();

            System.out.println("Digite suas faltas: ");
            faltas = teclado.nextInt();

            if (objFile.exists() && objFile.isFile()) {
                arquivo = new FileOutputStream(objFile, true); // abre em modo de append
                gravarArquivo = new DataOutputStream(arquivo);

                gravarArquivo.writeUTF(matricula);
                gravarArquivo.writeUTF(nome);
                gravarArquivo.writeDouble(teste);
                gravarArquivo.writeDouble(prova);
                gravarArquivo.writeInt(faltas);


                gravarArquivo.close();

                System.out.println("Arquivo Gravado com sucesso!");
            }else{
                System.out.println("Arquivo não existe ou não é um arquivo regular.");
            }
        }catch (IOException e){
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        } finally {
            teclado.close(); // Feche o Scanner quando terminar
        }

    }
}