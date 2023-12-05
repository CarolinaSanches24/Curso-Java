public class Usuario {
    private int idade;

    public void setIdade( int i){
        idade= i;
    }
    public int getIdade(){
        return idade;
    }

    public boolean VerificarIdade() {
        if (idade > 18) {
            return true;
        } else {
            return false;
        }
    }
}
