import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

private JTextField nombreInput;
private JLabel logoImg, title, ingreseNombre, footer;
private JButton botonIngresar, botonSalir;
public static String nombre ="";

public Bienvenida(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(27,70,141,255));
  setIconImage(new ImageIcon(getClass().getResource("images/oreo-icono.png")).getImage());
  
  ImageIcon imagenOriginal = new ImageIcon("images/Oreo-logo.png");
  Image imagenRedimensionada = imagenOriginal.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
  ImageIcon imagen = new ImageIcon(imagenRedimensionada);

  logoImg = new JLabel(imagen);
  logoImg.setBounds(-25,15,400,100);
  add(logoImg);

  title = new JLabel("Sistema de Control Vacacional");
  title.setBounds(35,135,300,30);
  title.setFont(new Font("Andale Mono", 3, 18));
  title.setForeground(new Color(255,255,255));
  add(title);

  ingreseNombre = new JLabel("Ingrese su nombre");
  ingreseNombre.setBounds(45,212,200,30);
  ingreseNombre.setFont(new Font("Andale Mono", 1, 12));
  ingreseNombre.setForeground(new Color(255,255,255));
  add(ingreseNombre);

  footer = new JLabel("© 2017 The Oreo Company ");
  footer.setBounds(85,375,300,30);
  footer.setFont(new Font("Andale Mono", 1, 12));
  footer.setForeground(new Color(255,255,255));
  add(footer);

  nombreInput = new JTextField();
  nombreInput.setBounds(45,240,255,25);
  nombreInput.setBackground(new Color(224,224,224));
  nombreInput.setFont(new Font("Andale Mono", 1, 14));
  nombreInput.setForeground(new Color(0,0,100));
  add(nombreInput);

  botonIngresar = new JButton("Ingresar");
  botonIngresar.setBounds(65,280,100,30);
  botonIngresar.setBackground(new Color(224,224,224));
  botonIngresar.setFont(new Font("Andale Mono", 1, 14));
  botonIngresar.setForeground(new Color(0,0,100));
  botonIngresar.addActionListener(this);
  add(botonIngresar);

  botonSalir = new JButton("Salir");
  botonSalir.setBounds(185, 280,100,30);
  botonSalir.setBackground(new Color(224,224,224));
  botonSalir.setFont(new Font("Andale Mono", 1, 14));
  botonSalir.setForeground(new Color(0,0,100));
  botonSalir.addActionListener(this);
  add(botonSalir);
}

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == botonIngresar){
      nombre = nombreInput.getText().trim();
      if(nombre.length()<1){
        JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
      } else{
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }

    if(evento.getSource()==botonSalir){
      System.exit(0);
    }
  }
  
  public static void main(String args[]){
    Bienvenida ventanaBienvenida = new Bienvenida();
    ventanaBienvenida.setBounds(0,0,350,450);
    ventanaBienvenida.setVisible(true);
    ventanaBienvenida.setResizable(false);
    ventanaBienvenida.setLocationRelativeTo(null);
  }

}