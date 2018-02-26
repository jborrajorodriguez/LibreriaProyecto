package com.proyecto.introducirdatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class IntroducirDatos {
    /**
     * Metodo para pedir datos String
     * 
     * @param mensage mensaje a mostrar
     * @return dato recogido
     */
    public static String introducirString(String mensage){
        String m=JOptionPane.showInputDialog(mensage);
        return m;
    }
    /**
     * Metodo para pedir datos Int
     * 
     * @param mensage mensaje a mostrar
     * @return dato recogido
     */
    public static int introducirInt(String mensage){
        int dato=Integer.parseInt(JOptionPane.showInputDialog(mensage));
        return dato;
    }
}
