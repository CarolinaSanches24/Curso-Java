import java.util.Scanner;
public class estruturaRepeticaoAninhada {
    public static void main (String[]args){
        System.out.println("---Qual operação deseja Realizar---" +
                "\n MENU\n[1]Soma\n[2]Subtração" +
                "\n[3]Multiplicacao\n[4]Divisao");

        System.out.println("Digite um número:");
        String sinal="";
        int operacao=0;
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();

        for(int x=1; x<=10;x++){
            for(int j=1; j<=10; j++){
                switch(opcao){
                    case 1:
                       sinal="+";
                       operacao= x+j;
                        System.out.println(x+sinal+j+"="+operacao);
                        break;
                    case 2:
                        sinal="-";
                        operacao= x-j;
                        System.out.println(x+sinal+j+"="+operacao);
                        break;
                    case 3:
                        sinal="x";
                        operacao= x*j;
                        System.out.println(x+sinal+j+"="+operacao);
                        break;
                    case 4:
                        sinal="/";
                        operacao= x/j;
                        System.out.println(x+sinal+j+"="+operacao);
                        break;
                }
            }
        }
    }
}
