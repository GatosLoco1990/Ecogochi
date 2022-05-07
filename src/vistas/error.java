package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class error extends JFrame {
    public JPanel panel = new JPanel();

    public error() {
        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("¡Error en el inicio de sesión!", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
