package net.salesianos.util;

public class Validador {
    public static boolean esEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int convertirEnteri(String texto) {
        return Integer.pareseInt(texto);
    }

}
