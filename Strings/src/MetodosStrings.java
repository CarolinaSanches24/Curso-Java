public class MetodosStrings {

    void mostrarMetodosStrings(String nome){

        System.out.println("Tamanho da String : "+ nome.length());
        System.out.println("Converter para minuscula: " + nome.toLowerCase());
        System.out.println(" Converter para maiuscula: "+ nome.toUpperCase());
        System.out.println("Retorna o caracter na posicao especifica: "+ nome.charAt(2));
        System.out.println("Verifica se esta vazio: " + nome.isEmpty());
        System.out.println("Retorna a posicao que o elemento foi encontrado: "+nome.indexOf("ol"));
        System.out.println("Verifica se na String contem o elemento : " + nome.contains("Ca"));
        System.out.println("Concatenacao de String: " + nome.concat(" Moraes"));
        System.out.println("Verifica se o conteudo e igual : " + nome.equals("Carolina Sanches"));
        System.out.println("Compara duas strings sem considerar as diferenças entre maiusculas e minusculas: " +nome.equalsIgnoreCase("carol"));

    }
    
}
