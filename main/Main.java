import javax.swing.*;

import java.awt.*;

class Main {

    private boolean sessao = false;

    public void login() {

        System.out.println("Acessando sistema de Login");

    }

    public static void main(String args[]) {

        Main api = new Main();

        JFrame janela = new JFrame("Gerenciador de Grupos 2.000");

        janela.setSize(800, 400);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Seja bem vindo ao Gerenciador de grupos");

        JPanel painel = new JPanel(null);

        painel.add(label);

        Dimension dimencao = label.getPreferredSize();

        label.setBounds(300 / 2, 150 / 2, 300 / 2, 150 / 2);

        janela.add(painel);

        janela.setSize(300, 150);

        janela.setVisible(true);


        // Verifica se sessão existe

        if (api.sessao) {

            System.out.println("Sessão já aberta");

        } else {

            api.login();

        }

    }

}