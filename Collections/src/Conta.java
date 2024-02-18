public class Conta {
    private String titularContaCorrente;
    private double saldo;

    //método construtor
    public Conta(String titular, double saldo){
        this.titularContaCorrente = titular;
        this.saldo = saldo;
    }

    public String getTitularContaCorrente(){
        return titularContaCorrente;
    }
    public void setTitularContaCorrente(String contaCorrente){
        this.titularContaCorrente=contaCorrente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //sobrescrita do método
    @Override
    public String toString(){
        return "C.C:"+this.titularContaCorrente+"Saldo R$:"+this.saldo;
    }
}
