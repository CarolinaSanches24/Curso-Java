import java.util.Scanner;
public class escolhaCaso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Formas de Pagamento:\n" +
                "[1]- Dinheiro\n" +
                "[2]- Cartão\n" +
                "[3]-Pix");
        System.out.println("Digite o número da Opção de Pagamento desejada:");
        int opcao = input.nextInt();
        String formaPagamento = switch (opcao) {
            case 1 -> "Dinheiro";
            case 2 -> "Cartão";
            case 3 -> "Pix";
            default -> "";
        };
        System.out.println("A forma de pagamento escolhida foi:"+ formaPagamento);


    }
}
