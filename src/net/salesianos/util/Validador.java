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

    public static int convertirEntero(String texto) {
        return Integer.pareseInt(texto);
    }

    public static boolean estaRango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }

    public static boolean textoValidado(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}
