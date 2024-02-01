import javax.swing.JOptionPane;
public class Boletim {
    public static void main(String [] args){

        float [] notas = new float[4];

        for (int i = 0; i< notas.length; i++ ) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota do aluno:"));
        }
        mostrarNotas(notas);
        calcularMedia(notas);
    }
    public static void mostrarNotas(float[]notas){
        StringBuilder notasString = new StringBuilder("Notas do Aluno:\n");

        for(int i=0; i<notas.length; i++ ){
            notasString.append("Nota ").append(i+1).append(": ").append(notas[i]).append(("\n"));
        }

        JOptionPane.showMessageDialog(null, notasString.toString());
    }
    public static void calcularMedia(float[]notas){
        float media, soma = 0;
        for (int i =0; i< notas.length; i++){
            soma += notas[i];
        }
        media = soma/ notas.length;

       if(media>=5 && media<7){
           JOptionPane.showMessageDialog(null,"Média do Aluno :"+media+ "\nO Aluno está em Recuperação");

       }else if(media>=7){
           JOptionPane.showMessageDialog(null,"Média do Aluno :"+media+ "\nO Aluno está Aprovado");
       }else{
           JOptionPane.showMessageDialog(null,"Média do Aluno :"+media+ "\nO Aluno está Reprovado");
       }
    }

}
