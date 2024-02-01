import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel("Escolha uma Forma de Pagamento", JLabel.CENTER);
        label.setFont(new Font("Times new Roman", Font.BOLD,40));
        label.setForeground(Color.white);
        //checkbox
        JCheckBox cartao = new JCheckBox("Cartão");
        cartao.setOpaque(false);
        cartao.setForeground(Color.WHITE);
        JCheckBox dinheiro = new JCheckBox("Dinheiro");
        dinheiro.setOpaque(false);
        dinheiro.setForeground(Color.WHITE);
        JCheckBox pix = new JCheckBox("Pix");
        pix.setOpaque(false);
        pix.setForeground(Color.WHITE);

        // Painel para conter os componentes
        JPanel panel = new JPanel();
        // Configurando o JPanel para ser transparente
        panel.setOpaque(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //lAYOUT VERTICAL
        panel.add(label);
        panel.add(dinheiro);
        panel.add(cartao);
        panel.add(pix);

        //janela
        JFrame janela = new JFrame();
        janela.setSize(700,700);
        // cor de fundo da janela
        janela.getContentPane().setBackground(new Color(25,25,112));
        janela.add(panel);


         dinheiro.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (dinheiro.isSelected()) {
                    JOptionPane.showMessageDialog(janela, "Você escolheu dinheiro");
                }
            }
        });
        cartao.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (cartao.isSelected()) {
                    JOptionPane.showMessageDialog(janela, "Você escolheu cartão");
                }
            }
        });

        pix.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (pix.isSelected()) {
                    JOptionPane.showMessageDialog(janela, "Você escolheu Pix");
                }
            }
        });

        janela.setVisible(true);
    }
}