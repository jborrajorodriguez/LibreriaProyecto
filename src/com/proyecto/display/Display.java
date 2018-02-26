package com.proyecto.display;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Display {
    /**
     * Método mostrar mensaje.
     * @param mensaje de tipo String.Es el mensaje que se quiere mostrar.
     */
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }

}
