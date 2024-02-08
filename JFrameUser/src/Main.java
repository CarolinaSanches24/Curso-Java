import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Calcular média do aluno");
        // definicao do tamanho do frame
        frame.setSize(400,300);

        // Criando um painel para conter os componentes
        JPanel panel = new JPanel(new GridBagLayout());

        // Criando um objeto para as configurações do GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 5, 10); // Define as margens entre os componentes

        // Criando os rótulos e campos de texto
        JLabel labelNome = new JLabel("Digite seu nome:");
        JTextField campoNome = new JTextField(20);

        JLabel labelTurma = new JLabel("Digite a turma:");
        JTextField campoTurma = new JTextField(20);

        JLabel labelNota1 = new JLabel("Digite a nota do 1º bimestre:");
        JTextField campoNota1 = new JTextField(20);

        JLabel labelNota2 = new JLabel("Digite a nota do 2º bimestre:");
        JTextField campoNota2 = new JTextField(20);

        JLabel labelNota3 = new JLabel("Digite a nota do 3º bimestre:");
        JTextField campoNota3 = new JTextField(20);

        // Criando um botão para enviar os dados
        JButton button = new JButton("Enviar");

        // Adicionando os componentes ao painel
        gbc.gridx = 0; //controla a posição horizontal do componente na grade
        gbc.gridy = 0; // controla a posição vertical do componente na grade
        panel.add(labelNome, gbc);

        gbc.gridx = 1;
        panel.add(campoNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelTurma, gbc);

        gbc.gridx = 1;
        panel.add(campoTurma, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelNota1, gbc);

        gbc.gridx = 1;
        panel.add(campoNota1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelNota2, gbc);

        gbc.gridx = 1;
        panel.add(campoNota2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelNota3, gbc);

        gbc.gridx = 1;
        panel.add(campoNota3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2; // Define que o botão ocupará duas colunas
        gbc.anchor = GridBagConstraints.CENTER; // Define a posição do botão no centro
        panel.add(button, gbc);

        button.addActionListener(enviarDados ->{
            String nome = campoNome.getText();
            try {
                double nota1 = Double.parseDouble(campoNota1.getText());
                double nota2 = Double.parseDouble(campoNota2.getText());
                double nota3 = Double.parseDouble(campoNota3.getText());

                double media = (nota1 + nota2 + nota3) / 3.0;
                JOptionPane.showMessageDialog(frame, " Média do Aluno " + nome + "=" + media);
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(frame, "Erro: Insira valores númericos válidos para nota Ex: 7.5");
            }
        });


        frame.add(panel);

        // aparece o frame centralizado
        frame.setLocationRelativeTo(null);
        // Define o tamanho da janela automaticamente baseado no conteúdo
        frame.pack();
        // comportamento padrão de fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Torna o frame visivel
        frame.setVisible(true);
    }
}