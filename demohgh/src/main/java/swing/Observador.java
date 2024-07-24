package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Observador {

    public static void main(String[] args) {
        // Criação da janela
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 800);
        janela.setLocationRelativeTo(null);

        // Criação do botão
        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        // Adicionando o ActionListener ao botão
        botao.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                // Código a ser executado quando o botão for clicado
                System.out.println("Botão clicado!");
            }
        });
        janela.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'focusGained'");
            }

            @Override
            public void focusLost(FocusEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'focusLost'");
            }
            
        });

        // Tornar a janela visível
        janela.setVisible(true);
    }
}
