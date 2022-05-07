package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cuidar extends JFrame {
    public JPanel panel = new JPanel();

    public Cuidar(int i) {
        panel.setLayout(null);
        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Nombre de mascota", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);
        // Opciones
        petCare(i);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void petCare(int i) {

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon("img/ante.png");
        picture.setBounds(130, 30, 250, 200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);

        JLabel health = new JLabel("Salud: X%", SwingConstants.CENTER);
        health.setBounds(50, 250, 80, 20);
        health.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(health);

        JButton buttonHealth = new JButton();
        buttonHealth.setBounds(50, 275, 80, 80);
        // button2.setOpaque(true); si no se puede cambiar el color de fondo
        ImageIcon ima = new ImageIcon("img/health.png");
        buttonHealth.setIcon(new ImageIcon(ima.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonHealth);

        JLabel hunger = new JLabel("Hambre: X%", SwingConstants.CENTER);
        hunger.setBounds(195, 250, 100, 20);
        hunger.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(hunger);

        JButton buttonHunger = new JButton();
        buttonHunger.setBounds(200, 275, 80, 80);
        // button2.setOpaque(true); si no se puede cambiar el color de fondo
        ImageIcon imah = new ImageIcon("img/hunger.jpg");
        buttonHunger.setIcon(new ImageIcon(imah.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonHunger);

        JLabel sleep = new JLabel("Sueño: X%", SwingConstants.CENTER);
        sleep.setBounds(370, 250, 80, 20);
        sleep.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(sleep);

        JButton buttonSleep = new JButton();
        buttonSleep.setBounds(360, 275, 80, 80);
        ImageIcon imaS = new ImageIcon("img/sleep.png");
        buttonSleep.setIcon(new ImageIcon(imaS.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(buttonSleep);

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