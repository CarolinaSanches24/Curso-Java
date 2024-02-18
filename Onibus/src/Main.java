public class Main {
    public static void main(String[] args) {
        Onibus novoOnibus = new Onibus();
        novoOnibus.modelo = "Mercedes";
        novoOnibus.capacidade = 50;

        System.out.println("Modelo do ônibus: " + novoOnibus.modelo);
        System.out.println("Capacidade do ônibus: "+novoOnibus.capacidade + " pessoas");

        novoOnibus.dirigir();

    }
}