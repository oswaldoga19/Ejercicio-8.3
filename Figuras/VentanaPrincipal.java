package Figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá consultar un menú principal con tres figuras geométricas.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Un contenedor de elementos gráficos
    private Container contenedor;
    // Botones para seleccionar una figura geométrica determinada
    private JButton cilindro, esfera, pirámide;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras"); // Establece el título de la ventana
        setSize(350, 160); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el contenedor no tiene un layout */

        // Establece el botón del cilindro
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23); /* Establece la posición del botón del cilindro */
        /* Agrega al botón un ActionListener para que gestione eventos del botón */
        cilindro.addActionListener(this);

        // Establece el botón de la esfera
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23); /* Establece la posición del botón de la esfera */
        /* Agrega al botón un ActionListener para que gestione eventos del botón */
        esfera.addActionListener(this);

        // Establece el botón de la pirámide
        pirámide = new JButton();
        pirámide.setText("Pirámide");
        pirámide.setBounds(225, 50, 100, 23); /* Establece la posición del botón de la pirámide */
        /* Agrega al botón un ActionListener para que gestione eventos del botón */
        pirámide.addActionListener(this);

        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(pirámide);
    }

    /**
     * Método que gestiona los eventos generados en la ventana principal
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) { // Si se pulsa el botón esfera
            VentanaEsfera ventanaEsfera = new VentanaEsfera(); /* Crea la ventana de la esfera */
            ventanaEsfera.setVisible(true); /* Establece que se visualice la ventana de la esfera */
        }
        if (evento.getSource() == cilindro) { /* Si se pulsa el botón cilindro */
            VentanaCilindro ventanaCilindro = new VentanaCilindro(); /* Crea la ventana del cilindro */
            ventanaCilindro.setVisible(true); /* Establece que se visualice la ventana del cilindro */
        }
        if (evento.getSource() == pirámide) { /* Si se pulsa el botón pirámide */
            VentanaPirámide ventanaPiramide = new VentanaPirámide(); /* Crea la ventana de la pirámide */
            ventanaPiramide.setVisible(true); /* Establece que se visualice la ventana de la pirámide */
        }
    }
}
