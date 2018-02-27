package com.proyecto.introducirdatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class IntroducirDatos{

    /**
     * Metodo para pedir datos String
     *
     * @param mensaje mensaje a mostrar
     * @return dato recogido
     */
    public static String introducirString(String mensaje){
        String m=JOptionPane.showInputDialog(mensaje);
        return m;
    }

    /**
     * Metodo para pedir datos Int
     *
     * @param mensaje mensaje a mostrar
     * @return dato recogido
     */
    public static int introducirInt(String mensaje){
        int dato=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    /**
     * Metodo para pedir datos Boolean
     *
     * @param mensaje mensaje a mostrar
     * @return dato recogido
     */
    public static boolean introducirBoolean(String mensaje){
        boolean b=Boolean.parseBoolean(JOptionPane.showInputDialog(mensaje));
        return b;
    }
}
