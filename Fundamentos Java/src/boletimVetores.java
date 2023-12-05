import javax.swing.JOptionPane;
public class boletimVetores {

    public static double calcularMedia(double []arrayNotas){
        double resultado=0;
        for (double arrayNota : arrayNotas) {
            resultado += arrayNota;
        }
        return resultado/arrayNotas.length;
    }
    public static void main(String[] args) {
        double []notasCarlos= new double[4];

        for (int i = 0; i< notasCarlos.length; i++) {
           double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " +(i+1)+"ª do aluno:"));
            notasCarlos[i]=nota;

        }
        double media = calcularMedia(notasCarlos);
        JOptionPane.showMessageDialog(null, "Média de Carlos:"+ media);

        StringBuilder mensagem = new StringBuilder("Notas de Carlos:\n");
        for (int i = 0; i < notasCarlos.length; i++) {
            mensagem.append("Nota ").append(i + 1).append(": ").append(notasCarlos[i]).append("\n");
        }


        JOptionPane.showMessageDialog(null, mensagem.toString());




    }
}
