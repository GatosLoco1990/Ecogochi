package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import clases.news;

public class Noticias extends JFrame {
    public news ne = new news();
    public JPanel panel = new JPanel();

    public Noticias(int i) {
        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Noticias", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Opciones
        readNews(i);
    }

    private void readNews(int i) {

        JButton noticia1 = new JButton(ne.getnw()[0].getTitulo());
        noticia1.setBounds(5, 40, 475, 50);
        noticia1.setBackground(Color.decode("#458bc6"));
        noticia1.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia1);

        JButton noticia2 = new JButton("Las empresas renovables");
        noticia2.setBounds(5, 100, 475, 50);
        noticia2.setBackground(Color.green);
        noticia2.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia2);

        JButton noticia3 = new JButton("Un mundo más verde");
        noticia3.setBounds(5, 160, 475, 50);
        noticia3.setBackground(Color.decode("#458bc6"));
        noticia3.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia3);

        JButton noticia4 = new JButton("Lorem ipsum");
        noticia4.setBounds(5, 220, 475, 50);
        noticia4.setBackground(Color.green);
        noticia4.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia4);

        JButton noticia5 = new JButton("Lorem ipsum");
        noticia5.setBounds(5, 280, 475, 50);
        noticia5.setBackground(Color.decode("#458bc6"));
        noticia5.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia5);

        // Acciones

        JButton home = new JButton();
        home.setBounds(5, 5, 15, 15);
        ImageIcon house = new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);

        ActionListener goHome = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Usuario v1 = new Usuario(i);
                v1.setVisible(true);
                dispose();

            }
        };
        home.addActionListener(goHome);

        ActionListener readNew = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                NoticiaView v1 = new NoticiaView(i, 0);
                v1.setVisible(true);
                dispose();

            }
        };
        noticia1.addActionListener(readNew);

        // Volver a la pagina inicial

    }

}
