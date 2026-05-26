import javax.swing.*;
import java.awt.*;

public class Main{

    boolean sessao = false;

    public static void main(String args[]){


        JFrame janela = new JFrame('Gerenciador de Grupos 2.000');
        
        janela.setSize(800, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel label = new JLabel('Seja bem vindo ao Gerenciador de grupos');
        JPanel painel = new JPanel(null);

        painel.add(label);

        Dimension dimencao = label.getPreferedSize();
        label.setBounds(300/2, 150/2, dimencao.width, dimencao.heigth);

        janela.add(painel);
        janela.setSize(300,150); 
        janela.setVisible(true);


        // Loop da Tela de Login
        if (this.sessao){

        } else{
            this.login();
        }

    }

    public void login(){
        


    }

} 