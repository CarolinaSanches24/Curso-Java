public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial){
        saldo = saldoInicial;
    }

    public void depositar(double valor){
        try{
            if(valor>0){
                saldo+=valor;
                System.out.println("Depósito: "+valor + " realizado com sucesso");
            }
        }catch (Exception e){
            System.out.println("Valor Inválido para depósito");
        }
    }
    public void sacar(double valor){
        try{
            if(valor>0 && valor <=saldo){
                saldo-=valor;
                System.out.println("Saque "+valor + " realizado com sucesso!");
            }
        }catch (Exception e){
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
