public class StringManipulator {
    String nomeComBuffer;
    //StringBuffer é seguro para threads devido a todos os métodos sincronizados.
    void metodoBuffer(String nome, String sobrenome){
        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobrenome);

        nomeComBuffer = buffer.toString();
        System.out.println(nomeComBuffer);
    }
    
}
