package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import clases.news;

public class NoticiaView extends JFrame {
    public news ne = new news();

    public JPanel panel = new JPanel();

    public NoticiaView(int i, int m) {
        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel(ne.getnw()[m].getTitulo(), SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Opciones
        openNews(i, m);
    }

    private void openNews(int i, int m) {

        JLabel autor = new JLabel(ne.getnw()[m].getAutor(), SwingConstants.CENTER);
        autor.setBounds(100, 40, 300, 50);
        autor.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(autor);

        JLabel fecha = new JLabel(ne.getnw()[m].getFecha(), SwingConstants.CENTER);
        fecha.setBounds(100, 90, 300, 50);
        fecha.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(fecha);

        JTextArea tip1 = new JTextArea(ne.getnw()[m].getDescripcion());
        tip1.setBounds(20, 140, 420, 150);
        tip1.setEditable(false);
        panel.add(tip1);
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

        // Volver a la pagina inicial

    }

}
