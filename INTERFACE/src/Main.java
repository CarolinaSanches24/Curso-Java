public class Main {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        cp.depositar(732);
        cp.sacar(50);
        System.out.println(cp.getSaldo());
    }
}