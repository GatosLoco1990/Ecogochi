package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import clases.pet;

public class Detalles extends JFrame {
    public JPanel panel = new JPanel();

    public Detalles(int i, int id) {
        pet ma = new pet();

        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel(ma.getMasco()[id].getNombre(), SwingConstants.CENTER);
        title.setBounds(30, 10, 400, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextArea txt = new JTextArea(ma.getMasco()[id].getDescripcion());
        txt.setBounds(20, 140, 420, 150);
        txt.setEditable(false);
        panel.add(txt);

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

    }

}
