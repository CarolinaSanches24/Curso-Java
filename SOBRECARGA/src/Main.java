class Desenho{
    public void mostrar(){
        for(int i=0 ; i<10;i++){
            System.out.println("*");
        }
    }
    public void mostrar(char simb){
        for(int i=0; i<10;i++){
            System.out.println(simb);
        }
    }
    public void mostrar(char simb, int limite){
        for(int i=0; i<limite;i++){
            System.out.println(simb);
        }
    }

}
public class Main {
    public static void main(String[] args) {

        Desenho d1 = new Desenho();
        d1.mostrar();
        d1.mostrar('#');
        d1.mostrar('$',3);
    }
}