package calculadora;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class ClaseInterfaz extends JFrame{
    
    public static JTextField pantalla;
    private JButton sumar;
    private JButton restar;
    private JButton multiplicar;
    private JButton dividir;
    private JButton c;
    private JButton decimales;
    private JButton cero;
    private JButton uno;
    private JButton cuatro;
    private JButton cinco;
    private JButton intro;
    private JButton dos;
    private JButton tres;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton abrir;
    private JButton cerrar;
    
    public ClaseInterfaz () {

        // Crear la ventana de la aplicacion
        JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(500, 390);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Crear los componentes
        pantalla = new JTextField(25);
        pantalla.setBounds(10, 10, 300, 60);
        pantalla.setFont(new Font("Arial",Font.BOLD, 40));
        sumar = new JButton("+");
        sumar.setBounds(320, 10, 75, 55);
        sumar.setFont(new Font("TimesRoman",Font.BOLD, 40));
        restar = new JButton("-");
        restar.setBounds(400, 10, 75, 55);
        restar.setFont(new Font("TimesRoman",Font.BOLD, 40));
        multiplicar = new JButton("*");
        multiplicar.setBounds(320, 75, 75, 55);
        multiplicar.setFont(new Font("TimesRoman",Font.BOLD, 40));
        dividir = new JButton("/");
        dividir.setBounds(400, 75, 75, 55);
        dividir.setFont(new Font("TimesRoman",Font.BOLD, 40));
        c = new JButton("C");
        c.setBounds(320, 140, 155, 60);
        c.setFont(new Font("TimesRoman",Font.BOLD, 25));
        intro = new JButton("=");
        intro.setBounds(320, 280, 155, 65);
        intro.setFont(new Font("TimesRoman",Font.BOLD, 45));
        cero = new JButton("0");
        cero.setBounds(115, 290, 85, 55);
        cero.setFont(new Font("TimesRoman",Font.BOLD, 25));
        siete = new JButton("7");
        siete.setBounds(10, 80,85 ,55);
        siete.setFont(new Font("TimesRoman",Font.BOLD, 25));
        ocho = new JButton("8");
        ocho.setBounds(115, 80, 85, 55);
        ocho.setFont(new Font("TimesRoman",Font.BOLD, 25));
        nueve = new JButton("9");
        nueve.setBounds(220, 80, 85, 55);
        nueve.setFont(new Font("TimesRoman",Font.BOLD, 25));
        cuatro = new JButton("4");
        cuatro.setBounds(10, 150, 85, 55);
        cuatro.setFont(new Font("TimesRoman",Font.BOLD, 25));
        cinco = new JButton("5");
        cinco.setBounds(115, 150, 85, 55);
        cinco.setFont(new Font("TimesRoman",Font.BOLD, 25));
        seis = new JButton("6");
        seis.setBounds(220, 150, 85, 55);
        seis.setFont(new Font("TimesRoman",Font.BOLD, 25));
        uno = new JButton("1");
        uno.setBounds(10, 220, 85, 55);
        uno.setFont(new Font("TimesRoman",Font.BOLD, 25));
        dos = new JButton("2");
        dos.setBounds(115, 220, 85, 55);
        dos.setFont(new Font("TimesRoman",Font.BOLD, 25));
        tres = new JButton("3");
        tres.setBounds(220, 220, 85, 55);
        tres.setFont(new Font("TimesRoman",Font.BOLD, 25));
        abrir = new JButton("(");
        abrir.setBounds(10, 290, 85, 55);
        abrir.setFont(new Font("TimesRoman",Font.BOLD, 25));
        cerrar = new JButton(")");
        cerrar.setBounds(220, 290, 85, 55);
        cerrar.setFont(new Font("TimesRoman",Font.BOLD, 25));
        decimales = new JButton(".");
        decimales.setBounds(320, 210, 155, 60);
        decimales.setFont(new Font("TimesRoman",Font.BOLD, 45));
        
        // Llamar la atencion a la caja de texto
        pantalla.requestFocus();
        
        // Crear un contenedor
        JPanel panelDeContenido = new JPanel();
        panelDeContenido.setLayout(null);
        
        // Asociar los componentes al contenedor para que los muestre en su interior
        panelDeContenido.add (pantalla);
        panelDeContenido.add (sumar);
        panelDeContenido.add (restar);
        panelDeContenido.add (multiplicar);
        panelDeContenido.add (dividir);
        panelDeContenido.add (c);
        panelDeContenido.add (decimales);
        panelDeContenido.add (intro);
        panelDeContenido.add (cero);
        panelDeContenido.add (uno);
        panelDeContenido.add (dos);
        panelDeContenido.add (tres);
        panelDeContenido.add (cuatro);
        panelDeContenido.add (cinco);
        panelDeContenido.add (seis);
        panelDeContenido.add (siete);
        panelDeContenido.add (ocho);
        panelDeContenido.add (nueve);
        panelDeContenido.add (abrir);
        panelDeContenido.add (cerrar);

        // Asociar el contenedor a la ventana para que le muestre en su interior
        ventana.setContentPane(panelDeContenido);
        
        //Hacer visible la ventana
        ventana.setVisible(true);
        ventana.setResizable(true);
        
        sumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "+");
            }
        });
        
        restar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "-");
            }
        });
        
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "*");
            }
        });
        
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "/");
            }
        });
        
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
            }
        });
        
        decimales.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + ".");
            }
        });
        
        intro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClaseDatos.obtenerResultado();
            }
        });
        
        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "0");
            }
        });
        
        uno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });
        
        dos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "2");
            }
        });
        
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "3");
            }
        });
        
        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "4");
            }
        });
        
        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "5");
            }
        });
        
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "6");
            }
        });
        
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "7");
            }
        });
        
        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "8");
            }
        });
        
        nueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "9");
            }
        });
        
        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "(");
            }
        });
        
        cerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + ")");
            }
        });
        
        intro.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyChar() == '+') {
                    sumar.doClick();
                }
                else if (evt.getKeyChar() == '-') {
                    restar.doClick();
                }
                else if (evt.getKeyChar() == '*') {
                    multiplicar.doClick();
                }
                else if (evt.getKeyChar() == '/') {
                    dividir.doClick();
                }
                else {
                    pantalla.setText(pantalla.getText() + (evt));
                }
            }
        });

    }
    
    
}