import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem miCalculo,miAzul,miAzulOscuro,miGris,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox<String> comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;
    private JButton boton1;

    public Principal() {
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(27,70,141,255));
        setIconImage(new ImageIcon(getClass().getResource("images/oreo-icono.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(new Color(0, 0, 100));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(0, 0, 100));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(0, 0, 100));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(0, 0, 100));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(0, 0, 100));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(0, 0, 100));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miAzul = new JMenuItem("Azul");
        miAzul.setFont(new Font("Andale Mono", 1, 14));
        miAzul.setForeground(new Color(0, 0, 100));
        menuColorFondo.add(miAzul);
        miAzul.addActionListener(this);

        miAzulOscuro = new JMenuItem("Azul Oscuro");
        miAzulOscuro.setFont(new Font("Andale Mono", 1, 14));
        miAzulOscuro.setForeground(new Color(0, 0, 100));
        menuColorFondo.add(miAzulOscuro);
        miAzulOscuro.addActionListener(this);

        miGris = new JMenuItem("Gris");
        miGris.setFont(new Font("Andale Mono", 1, 14));
        miGris.setForeground(new Color(0, 0, 100));
        menuColorFondo.add(miGris);
        miGris.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(0, 0, 100));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("Creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(0, 0, 100));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(0, 0, 100));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
    
        ImageIcon imagenOriginal = new ImageIcon("images/Oreo-logo.png");
        Image imagenRedimensionada = imagenOriginal.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(imagenRedimensionada);
        labelLogo = new JLabel(imagen);  
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");  
        labelBienvenido.setBounds(280,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre completo:");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(0, 0, 100));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25,273,150,25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(0, 0, 100));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido Materno:");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25,334,150,25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(0, 0, 100));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox<String>();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new java.awt.Color(0, 0, 100));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox<String>();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new java.awt.Color(0, 0, 100));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o más de servicio");

        labelResultado = new JLabel("Resultado del Cálculo:");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setFont(new Font("Andale Mono", 1, 11));
        textarea1.setForeground(new Color(0, 0, 100));
        textarea1.setText("\n   Aquai aparece el resultado del cálculo de las vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,333,385,90);
        add(scrollpane1); 

        labelfooter = new JLabel("© 2017 The OREO Company | Todos los derechos reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelfooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelfooter);

        boton1 = new JButton("Calcular");
        boton1.setBounds(50, 380, 100, 30);
        boton1.setFont(new Font("Andale Mono", 1, 12));
        boton1.setForeground(new Color(0, 0, 100));
        boton1.addActionListener(this);
        add(this.boton1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo || e.getSource() == this.boton1) {
                String nombreTrabajador = this.txtNombreTrabajador.getText();
                String apellido1 = this.txtAPaternoTrabajador.getText();
                String apellido2 = this.txtAMaternoTrabajador.getText();
                String idDepartamento = this.comboDepartamento.getSelectedItem().toString();
                String antiguedad = this.comboAntiguedad.getSelectedItem().toString();
                byte vacaciones;
                if (idDepartamento == "Atencion al Cliente") {
                    if (antiguedad == "1 a\u00f1o de servicio") {
                        vacaciones = 6;
                    } else if (antiguedad == "2 a 6 a\u00f1os de servicio") {
                        vacaciones = 14;
                    } else if (antiguedad == "7 a\u00f1os o m\u00e1s de servicio") {
                        vacaciones = 20;
                    } else {
                        vacaciones = 0;
                    }
                    
                    this.textarea1.setText("   Empleado " + nombreTrabajador + " " + apellido1 + " " + apellido2 + "\n   Departamento:  " + idDepartamento + " \n   Antiguedad:   " + antiguedad + "\n\n   VACACIONES: " + vacaciones + " dias habiles");
                } else if (idDepartamento == "Departamento de Logistica") {
                    if (antiguedad == "1 a\u00f1o de servicio") {
                        vacaciones = 7;
                    } else if (antiguedad == "2 a 6 a\u00f1os de servicio") {
                        vacaciones = 15;
                    } else if (antiguedad == "7 a\u00f1os o m\u00e1s de servicio") {
                        vacaciones = 22;
                    } else {
                        vacaciones = 0;
                    }
                    
                    this.textarea1.setText("   Empleado " + nombreTrabajador + " " + apellido1 + " " + apellido2 + "\n   Departamento:  " + idDepartamento + " \n   Antiguedad:   " + antiguedad + "\n\n   VACACIONES: " + vacaciones + " dias habiles");
                } else if (idDepartamento == "Departamento de Gerencia") {
                    if (antiguedad == "1 a\u00f1o de servicio") {
                        vacaciones = 10;
                    } else if (antiguedad == "2 a 6 a\u00f1os de servicio") {
                        vacaciones = 20;
                    } else if (antiguedad == "7 a\u00f1os o m\u00e1s de servicio") {
                        vacaciones = 30;
                    } else {
                        vacaciones = 0;
                    }
                    
                    this.textarea1.setText("   Empleado " + nombreTrabajador + " " + apellido1 + " " + apellido2 + "\n   Departamento:  " + idDepartamento + " \n   Antiguedad:   " + antiguedad + "\n\n   VACACIONES: " + vacaciones + " dias habiles");
                } else {
                    this.textarea1.setText("Ese departamento no existe");
                }
                }
        
        if (e.getSource() == miAzul){
            this.getContentPane().setBackground(new Color(27, 70, 141, 255));
        }
        if (e.getSource() == miAzulOscuro){
            this.getContentPane().setBackground(new Color(0, 0, 100));
        }
	if (e.getSource() == miGris){
            this.getContentPane().setBackground(new Color(50, 50, 50));
        }
        if (e.getSource() == miNuevo){	
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedItem("");
            comboAntiguedad.setSelectedItem("");
            textarea1.setText("\n   Aqui aparece el resultado del c\u00e1lculo de las vacaciones.");
        }
	if (e.getSource() == miSalir){
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        this.setVisible(false);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
	}
        if (e.getSource() == miElCreador){
        JOptionPane.showMessageDialog((Component)null, "El mejor de todos: Jorginho");

        }

        }
    

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    } 
}