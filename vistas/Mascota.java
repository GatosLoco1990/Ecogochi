package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import clases.pet;

public class Mascota extends JFrame {
    public JPanel panel = new JPanel();
    private int i;
    pet ma = new pet();

    public Mascota(int i, int m) {
        panel.setLayout(null);
        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon(ma.getMasco()[m].getImagen());
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel(ma.getMasco()[m].getNombre(), SwingConstants.CENTER);
        title.setBounds(30, 10, 400, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        JButton details = new JButton("...");
        details.setBounds(430, 10, 20, 20);
        details.setBackground(Color.decode("#dbeddc"));
        details.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(details);

        ActionListener det = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Detalles v1 = new Detalles(i, ma.getMasco()[m].getId());
                v1.setVisible(true);
                dispose();

            }
        };
        details.addActionListener(det);

        // Opciones
        petView(i, m);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private void petView(int i, int m) {
        pet ma = new pet();

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon(ma.getMasco()[m].getImagen());
        picture.setBounds(30, 30, 250, 200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);

        JLabel health = new JLabel("Salud: " + ma.getMasco()[m].getSalud() + "%", SwingConstants.CENTER);
        health.setBounds(300, 60, 100, 30);
        health.setFont(new Font("arial", Font.BOLD, 14));
        health.setOpaque(true);
        panel.add(health);

        if (ma.getMasco()[0].getSalud() <= 25) {
            health.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getSalud() > 25 && ma.getMasco()[m].getSalud() <= 70) {
            health.setBackground(Color.YELLOW);
        } else {
            health.setBackground(Color.GREEN);
        }

        JLabel hunger = new JLabel("Hambre: " + ma.getMasco()[m].getHambre() + "%", SwingConstants.CENTER);
        hunger.setBounds(300, 100, 100, 30);
        hunger.setFont(new Font("arial", Font.BOLD, 14));
        hunger.setOpaque(true);
        panel.add(hunger);

        if (ma.getMasco()[0].getHambre() <= 25) {
            hunger.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getHambre() > 25 && ma.getMasco()[m].getHambre() <= 70) {
            hunger.setBackground(Color.YELLOW);
        } else {
            hunger.setBackground(Color.GREEN);
        }

        JLabel sleep = new JLabel("Sue??o: " + ma.getMasco()[m].getSueno() + "%", SwingConstants.CENTER);
        sleep.setBounds(300, 140, 100, 30);
        sleep.setFont(new Font("arial", Font.BOLD, 14));
        sleep.setOpaque(true);
        panel.add(sleep);

        if (ma.getMasco()[0].getSueno() <= 25) {
            sleep.setBackground(Color.RED);
        } else if (ma.getMasco()[0].getSueno() > 25 && ma.getMasco()[m].getSueno() <= 70) {
            sleep.setBackground(Color.YELLOW);
        } else {
            sleep.setBackground(Color.GREEN);
        }

        JLabel risk = new JLabel("Nivel de riesgo: " + ma.getMasco()[m].getNivelRiesgo(), SwingConstants.CENTER);
        risk.setBounds(140, 240, 200, 20);
        risk.setFont(new Font("arial", Font.BOLD, 14));
        risk.setForeground(Color.orange);
        panel.add(risk);

        JButton takeCare = new JButton("Cuidar");
        takeCare.setBounds(50, 270, 170, 50);
        takeCare.setBackground(Color.decode("#ffa0bd"));
        takeCare.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(takeCare);

        JButton unlock = new JButton("desbloquear");
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
                Cuidar v1 = new Cuidar(i, m);
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