import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> listaPersonagensOnePiece = new Vector<>();

        listaPersonagensOnePiece.add("Monkey D luffy");
        listaPersonagensOnePiece.add("Nami");
        listaPersonagensOnePiece.add("Roronoa Zoro");
        listaPersonagensOnePiece.add("Tony Tony Chopper");

        for(String nomePersonagem:listaPersonagensOnePiece){
            System.out.println(nomePersonagem);
        }
    }
}