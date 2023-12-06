import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList lista=new ArrayList<>();
        lista.add(0,"0");
        lista.add(1,"1");
        lista.set(1,"2");
        lista.remove("1");
        System.out.println(lista);


        ArrayList<Integer> segundaLista = new ArrayList<>();
        for(int i=0; i<8; i++)
        segundaLista.add(i, i+1);
        System.out.println(segundaLista.get(4));

    }
}