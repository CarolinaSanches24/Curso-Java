public class Main {
    public static void main(String[] args) {
       ContaBancaria novaConta = new ContaBancaria(1000);
       System.out.println("Saldo Inicial: "+novaConta.getSaldo());
       novaConta.depositar(50);
       System.out.println("Saldo após Deposito: " + novaConta.getSaldo());
       novaConta.sacar(100);
       System.out.println("Saldo após Saque: "+ novaConta.getSaldo());

    }
}