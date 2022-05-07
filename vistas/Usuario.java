package vistas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import perfiles.Personas;

public class Usuario extends JFrame {

    private int i;
    public JPanel panel = new JPanel();

    public Usuario(int i) {
        panel.setLayout(null);

        this.setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Perfil", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Opciones
        userView(i);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private void userView(int i) {

        Personas kka = new Personas();

        JLabel name = new JLabel("Nombre: " + kka.getPersonas()[i].getNombre(), SwingConstants.CENTER);
        name.setBounds(30, 40, 300, 30);
        name.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(name);

        JLabel points = new JLabel("Puntos: " + kka.getPersonas()[i].getPuntos(), SwingConstants.CENTER);
        points.setBounds(28, 70, 300, 30);
        points.setFont(new Font("arial", Font.BOLD, 14));
        panel.add(points);

        JButton pet = new JButton("Mascota");
        pet.setBounds(50, 190, 170, 50);
        pet.setBackground(Color.decode("#dbeddc"));
        pet.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(pet);

        JButton task = new JButton("Tareas");
        task.setBounds(230, 190, 170, 50);
        task.setBackground(Color.decode("#dbeddc"));
        task.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(task);

        JButton impacto = new JButton("Impacto");
        impacto.setBounds(50, 250, 170, 50);
        impacto.setBackground(Color.decode("#dbeddc"));
        impacto.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(impacto);

        JButton noticia = new JButton("Noticias");
        noticia.setBounds(230, 250, 170, 50);
        noticia.setBackground(Color.decode("#dbeddc"));
        noticia.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(noticia);
        // Acciones

        ActionListener pet1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int ini = 0;
                Mascota v1 = new Mascota(i, ini);
                v1.setVisible(true);
                dispose();

            }
        };
        pet.addActionListener(pet1);

        ActionListener task1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tareas v1 = new Tareas(i);
                v1.setVisible(true);
                dispose();

            }
        };
        task.addActionListener(task1);

        ActionListener impact1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Impacto v1 = new Impacto(i);
                v1.setVisible(true);
                dispose();

            }
        };
        impacto.addActionListener(impact1);

        ActionListener noticia1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Noticias v1 = new Noticias(i);
                v1.setVisible(true);
                dispose();

            }
        };
        noticia.addActionListener(noticia1);
        // Volver a la pagina inicial

    }

}
