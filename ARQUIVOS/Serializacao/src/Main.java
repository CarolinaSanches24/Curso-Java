import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Aluno
        Aluno p1 = new Aluno("John", 5, 10);
        Aluno p2 = new Aluno("Rachel", 3, 8);
        String path = "C:\\Users\\vmaur\\Documents\\Objetos.txt";


        // Escrevendo objetos Aluno no arquivo
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(p1);
            outputStream.writeObject(p2);
            System.out.println("Objetos Aluno foram escritos no arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        // Lendo objetos Aluno do arquivo
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
            Aluno alunoLido1 = (Aluno) inputStream.readObject();
            Aluno alunoLido2 = (Aluno) inputStream.readObject();

            // Exibindo os objetos lidos
            System.out.println("Aluno 1: " + alunoLido1);
            System.out.println("Aluno 2: " + alunoLido2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler do arquivo: " + e.getMessage());
        }
    }
}