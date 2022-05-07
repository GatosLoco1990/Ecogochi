package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import clases.pet;

public class Mascota extends JFrame {
    public JPanel panel = new JPanel();
    private int i;
    pet ma = new pet();

    public Mascota(int i) {
        panel.setLayout(null);
        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon(ma.getMasco()[0].getImagen());
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel(ma.getMasco()[0].getNombre(), SwingConstants.CENTER);
        title.setBounds(30, 10, 400, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        // Opciones
        petView(i);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private void petView(int i) {
        pet ma = new pet();

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon("img/pets/ante.png");
        picture.setBounds(30, 30, 250, 200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);

        JLabel health = new JLabel("Salud: " + ma.getMasco()[0].getSalud() + "%", SwingConstants.CENTER);
        health.setBounds(300, 60, 100, 30);
        health.setFont(new Font("arial", Font.BOLD, 14));
        health.setOpaque(true);
        panel.add(health);

        if (ma.getMasco()[0].getSalud() <= 25) {
            health.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getSalud() > 25 && ma.getMasco()[0].getSalud() <= 70) {
            health.setBackground(Color.YELLOW);
        } else {
            health.setBackground(Color.GREEN);
        }

        JLabel hunger = new JLabel("Hambre: " + ma.getMasco()[0].getHambre() + "%", SwingConstants.CENTER);
        hunger.setBounds(300, 100, 100, 30);
        hunger.setFont(new Font("arial", Font.BOLD, 14));
        hunger.setOpaque(true);
        panel.add(hunger);

        if (ma.getMasco()[0].getHambre() <= 25) {
            hunger.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getHambre() > 25 && ma.getMasco()[0].getHambre() <= 70) {
            hunger.setBackground(Color.YELLOW);
        } else {
            hunger.setBackground(Color.GREEN);
        }

        JLabel sleep = new JLabel("Sueño: " + ma.getMasco()[0].getSueno() + "%", SwingConstants.CENTER);
        sleep.setBounds(300, 140, 100, 30);
        sleep.setFont(new Font("arial", Font.BOLD, 14));
        sleep.setOpaque(true);
        panel.add(sleep);

        if (ma.getMasco()[0].getSueno() <= 25) {
            sleep.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getSueno() > 25 && ma.getMasco()[0].getSueno() <= 70) {
            sleep.setBackground(Color.YELLOW);
        } else {
            sleep.setBackground(Color.GREEN);
        }

        JLabel risk = new JLabel("Nivel de riesgo: " + ma.getMasco()[0].getNivelRiesgo(), SwingConstants.CENTER);
        risk.setBounds(140, 240, 200, 20);
        risk.setFont(new Font("arial", Font.BOLD, 14));
        risk.setForeground(Color.orange);
        panel.add(risk);

        JButton takeCare = new JButton("Cuidar");
        takeCare.setBounds(50, 270, 170, 50);
        takeCare.setBackground(Color.decode("#ffa0bd"));
        takeCare.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(takeCare);

        JButton unlock = new JButton("Más detalles");
        unlock.setBounds(240, 270, 170, 50);
        unlock.setBackground(Color.decode("#dbeddc"));
        unlock.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(unlock);

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

        ActionListener takeCareG = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Cuidar v1 = new Cuidar(i);
                v1.setVisible(true);
                dispose();

            }
        };
        takeCare.addActionListener(takeCareG);

        ActionListener unlock1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Desbloquear v1 = new Desbloquear(i);
                v1.setVisible(true);
                dispose();
            }
        };
        unlock.addActionListener(unlock1);
    }

}