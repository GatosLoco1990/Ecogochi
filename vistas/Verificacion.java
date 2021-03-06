package vistas;

import java.awt.event.*;
import java.lang.reflect.GenericArrayType;
import java.awt.*;
import javax.swing.*;

import perfiles.Personas;
import vistas.Usuario;

public class Verificacion extends JFrame {

    public JPanel panel = new JPanel();

    public Verificacion() {
        panel.setLayout(null);

        this.setSize(500, 250);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel);

        JLabel title = new JLabel("Inicie sesión", SwingConstants.CENTER);
        title.setBounds(90, 10, 300, 30);
        title.setFont(new Font("arial", Font.BOLD, 20));
        panel.add(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Opciones
        login();
    }

    private void login() {

        int x = 2;

        JTextField mail = new JTextField("correo");
        mail.setBounds(110, 50, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(mail);

        JTextField password = new JTextField("retuki");
        password.setBounds(110, 90, 250, 30);
        // System.out.println("Ingresado: "+text1.getText());
        panel.add(password);

        JButton send = new JButton("Enviar");
        send.setBounds(160, 150, 170, 50);
        send.setBackground(Color.decode("#dbeddc"));
        send.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(send);

        // Acciones
        if (mail != null && password != null) {

            ActionListener signA = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String correo = mail.getText().trim();
                    String contraseña = password.getText().trim();

                    Personas kka = new Personas();

                    VerificarUsuario(x, kka.getPersonas(), contraseña, correo);
                    dispose();

                }
            };
            send.addActionListener(signA);
        }
        JButton home = new JButton();
        home.setBounds(5, 5, 15, 15);
        ImageIcon house = new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);

        ActionListener goHome = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Home v1 = new Home();
                v1.setVisible(true);
                dispose();

            }
        };
        home.addActionListener(goHome);

        // Verificar que no estén vacios los campos
        // Ir a Usuario.java

    }

    public static void VerificarUsuario(int x, Personas[] persona, String contraseña, String correo) {
        int n = 0;

        for (int i = 0; i <= x - 1; i++) {
            if (persona[i].getCorreo().equals(correo)) {
                if (persona[i].getContrasena().equals(contraseña)) {
                    System.out.println("En veri es: " + i);

                    Usuario v1 = new Usuario(i);

                    v1.setVisible(true);
                    n = 1;
                    break;
                }
            }
        }
        if (n == 0) {
            error v1 = new error();
            v1.setVisible(true);

        }
    }

}
