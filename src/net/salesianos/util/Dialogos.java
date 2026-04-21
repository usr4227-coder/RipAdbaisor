package net.salesianos.util;

import javax.swing.JOptionPane;

public class Dialogos {

    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirNumero(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(texto);
    }

    public static void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
