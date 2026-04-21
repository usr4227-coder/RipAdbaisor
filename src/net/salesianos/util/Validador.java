package net.salesianos.util;

/*
 * Clase de utilidades para validar datos introducidos por el usuario.
 * Permite comprobar si un texto es un número entero, convertirlo,
 * verificar si un valor está dentro de un rango y validar que un texto
 * no esté vacío ni sea nulo.
 */
public class Validador {

    public static boolean esEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (Exception excepcion) {
            return false;
        }
    }

    public static int convertirEntero(String texto) {
        return Integer.parseInt(texto);
    }

    public static boolean estaEnRango(int numero, int minimo, int maximo) {
        return numero >= minimo && numero <= maximo;
    }

    public static boolean textoValido(String texto) {
        return texto != null && !texto.isEmpty();
    }
}
