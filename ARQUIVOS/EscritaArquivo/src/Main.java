import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;
        String path = "C:\\Users\\vmaur\\Documents\\arquivo.txt";

        try {
            FileWriter arquivo = new FileWriter(path);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);

            System.out.println("Digite a matrícula do aluno:");
            matricula = teclado.nextLine();
            gravarArquivo.println("Matrícula: " + matricula);

            System.out.println("Digite o nome do aluno:");
            nome = teclado.nextLine();
            gravarArquivo.println("Nome: " + nome);

            System.out.println("Digite a nota do teste:");
            teste = teclado.nextDouble();
            gravarArquivo.println("Nota do teste: " + teste);

            System.out.println("Digite a nota da prova:");
            prova = teclado.nextDouble();
            gravarArquivo.println("Nota da prova: " + prova);

            System.out.println("Digite o número de faltas:");
            faltas = teclado.nextInt();
            gravarArquivo.println("Faltas: " + faltas);

            gravarArquivo.close();
            System.out.println("Informações gravadas no arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        } finally {
            teclado.close(); // Feche o Scanner quando terminar
        }
    }
}