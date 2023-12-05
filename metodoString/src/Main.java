public class Main {
    public static void main(String[] args) {

       String primeira="Java";
       String segunda="C#";
       String terceira = new String("Python");
        System.out.println(primeira.toUpperCase()+"\n"+segunda.length()+"\n"+terceira);
        boolean result = primeira.equals(segunda);
        System.out.println("A primeira e igual a segunda?"+result);

        result= segunda.equals(terceira);
        System.out.println("Segunda é igual a terceira?"+result);
    }
}