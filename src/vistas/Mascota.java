package vistas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mascota extends JFrame {
    public JPanel panel = new JPanel();

    public Mascota(){
        panel.setLayout(null);
        this.setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("ECOGOCHI");
        ImageIcon img = new ImageIcon("img/logo.png");
        setIconImage(img.getImage());
        this.getContentPane().add(panel); 
       
        JLabel title = new JLabel("Mascota", SwingConstants.CENTER);
        title.setBounds( 90,10,300,30);
        title.setFont(new Font("arial", Font.BOLD,20));
        panel.add(title); 

        //Opciones
        petView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void petView(){

        JLabel picture = new JLabel();
        ImageIcon img = new ImageIcon("img/ante.png");
        picture.setBounds(30,30,250,200);
        picture.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panel.add(picture);
        
        JLabel health= new JLabel("Salud: X%", SwingConstants.CENTER);
        health.setBounds( 300,60,100,30);
        health.setFont(new Font("arial", Font.BOLD,14));
        panel.add(health); 

        JLabel hunger= new JLabel("Hambre: X%", SwingConstants.CENTER);
        hunger.setBounds( 300,100,100,30);
        hunger.setFont(new Font("arial", Font.BOLD,14));
        panel.add(hunger); 

        JLabel sleep= new JLabel("Sueño: X%", SwingConstants.CENTER);
        sleep.setBounds( 300,140,100,30);
        sleep.setFont(new Font("arial", Font.BOLD,14));
        panel.add(sleep); 

        JLabel risk= new JLabel("Nivel de riesgo: X", SwingConstants.CENTER);
        risk.setBounds( 140,240,200,20);
        risk.setFont(new Font("arial", Font.BOLD,14));
        risk.setForeground(Color.orange);
        panel.add(risk); 

        JButton takeCare = new JButton("Cuidar");
        takeCare.setBounds(50,270,170,50);
        takeCare.setBackground(Color.decode("#ffa0bd"));
        takeCare.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(takeCare);

        JButton unlock = new JButton("Desbloquear");
        unlock.setBounds(240,270,170,50);
        unlock.setBackground(Color.decode("#dbeddc"));
        unlock.setFont(new Font("arial", Font.BOLD, 17));
        panel.add(unlock);

        JButton home = new JButton();
        home.setBounds(5,5,15,15);
        ImageIcon house =  new ImageIcon("img/home.png");
        home.setIcon(new ImageIcon(house.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
        panel.add(home);
        
                ActionListener goHome = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae){ 
                        Usuario v1 = new Usuario();
                        v1.setVisible(true);
        
                    }
                };
                home.addActionListener(goHome);

        ActionListener takeCareG = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                Cuidar v1 = new Cuidar();
                v1.setVisible(true);

            }
        };
        takeCare.addActionListener(takeCareG);
    }
    

}