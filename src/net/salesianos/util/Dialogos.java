package net.salesianos.util;

import javax.swing.JOptionPane;

/*
 * Clase de utilidades para mostrar diálogos gráficos con JOptionPane.
 * Permite solicitar texto o números al usuario y mostrar mensajes de
 * información o error de forma centralizada para mantener el código limpio.
 */
public class Dialogos {

    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirNumero(String mensaje) {
        String textoIntroducido = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(textoIntroducido);
    }

    public static void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
