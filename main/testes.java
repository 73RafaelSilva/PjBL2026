import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String args[]){
        JFrame janela = new JFrame(title: '22/05');
        
        janela.setSize(width:800, heigth:400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel label = new JLabel('OLA');
        JPanel painel = new JPanel(null);

        painel.add(label);

        Dimension dimencao = label.getPreferedSize();
        label.setBounds(300/2, 150/2, dimencao.width, dimencao.heigth);

        janela.add(painel);
        janela.setSize(300,150);
        janela.setVisible(b: true);
    }
}