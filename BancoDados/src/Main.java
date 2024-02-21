import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        // Configuração de conexão com banco postgresql
        final String usuario = "postgres";
        final String senha = "123";
        final String url = "jdbc:postgresql://locahost:5432/postgres";
        final String driverBanco = "org.postgresql.Driver";

        try{
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso");
        }catch (Exception exception){
            System.out.println("Erro na conexão com banco de dados");
        }
    }
}