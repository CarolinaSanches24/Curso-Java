import java.util.Scanner;
public class App {
    public static void main(String[] args){
         System.out.println("Informe seu nome");

         String palavra;
         Scanner entrada = new Scanner(System.in);
         palavra= entrada.next();
        
         System.out.println("Operadores Aritméticos");

         double numA, numB, total;
         numA=5;
         numB=3;
         total = numA+numB;
         System.out.println(total);
         total = numA/numB;
         System.out.println(total);
         total = numA%numB;
         System.out.println(total);

         System.out.println("Operadores Lógicos");
         int a,b;
         a= 4;
         b=8;
         System.out.println( a>b &&b==8);
         System.out.println( a>b ||b==8);
         System.out.println("Estrutura Condicional Simples");
         int nota = 6;
         if(nota>=5){
             System.out.println("Aprovado\n Parabéns!" + palavra);
         }
         System.out.println("Estrutura Composta ");

         if(nota>=5){
             System.out.println("Aprovado.\n Parabéns!" + palavra);
         }else{
             System.out.println("Reprovado.\n Parabéns!" + palavra);
         }
         System.out.println("Condicional Aninhada ");

         if(nota>=5){
             System.out.println("Aprovado");
         }else if(nota>=3 && nota<5){
             System.out.println("Exame");
         }else{
             System.out.println("Aluno Reprovado");
         }

    }
}
