package net.salesianos.interfaz;

import javax.swing.JOptionPane;
import net.salesianos.servicio.ServicioElementos;
import net.salesianos.elemento.Elemento;
import net.salesianos.util.Dialogos;
import net.salesianos.util.Validador;

public class MenuPrincipal {

    private ServicioElementos servicio;

    public MenuPrincipal(ServicioElementos servicio) {
        this.servicio = servicio;
    }

    public void iniciar() {

        boolean salir = false;

        while (!salir) {

            String opcion = JOptionPane.showInputDialog(
                    "MENÚ PRINCIPAL\n\n" +
                            "1. Añadir elemento\n" +
                            "2. Editar elemento\n" +
                            "3. Mostrar elementos\n" +
                            "4. Eliminar elemento\n" +
                            "5. Salir\n\n" +
                            "Elige una opción:");

            if (opcion == null)
                continue;

            switch (opcion) {

                case "1":
                    agregar();
                    break;

                case "2":
                    editar();
                    break;

                case "3":
                    mostrar();
                    break;

                case "4":
                    eliminar();
                    break;

                case "5":
                    salir = true;
                    break;

                default:
                    Dialogos.mostrarError("Opción no válida.");
            }
        }
    }

    private void agregar() {

        String nombre = Dialogos.pedirTexto("Nombre:");
        if (!Validador.textoValido(nombre)) {
            Dialogos.mostrarError("El nombre no puede estar vacío.");
            return;
        }

        String categoria = Dialogos.pedirTexto("Categoría:");
        if (!Validador.textoValido(categoria)) {
            Dialogos.mostrarError("La categoría no puede estar vacía.");
            return;
        }

        String descripcion = Dialogos.pedirTexto("Descripción:");
        if (!Validador.textoValido(descripcion)) {
            Dialogos.mostrarError("La descripción no puede estar vacía.");
            return;
        }

        String textoPuntuacion = Dialogos.pedirTexto("Puntuación (0-5):");
        if (!Validador.esEntero(textoPuntuacion)) {
            Dialogos.mostrarError("Debes introducir un número entero.");
            return;
        }

        int puntuacion = Validador.convertirEntero(textoPuntuacion);
        if (!Validador.estaEnRango(puntuacion, 0, 5)) {
            Dialogos.mostrarError("La puntuación debe estar entre 0 y 5.");
            return;
        }

        Elemento e = new Elemento(nombre, categoria, descripcion, puntuacion);
        servicio.agregarElemento(e);

        Dialogos.mostrarInfo("Elemento añadido correctamente.");
    }

    private void editar() {

        String textoIndice = Dialogos.pedirTexto("Índice del elemento a editar:");
        if (!Validador.esEntero(textoIndice)) {
            Dialogos.mostrarError("Debes introducir un número entero.");
            return;
        }

        int indice = Validador.convertirEntero(textoIndice);

        if (indice < 0 || indice >= servicio.obtenerTodos().size()) {
            Dialogos.mostrarError("El índice no existe.");
            return;
        }

        String nombre = Dialogos.pedirTexto("Nuevo nombre:");
        if (!Validador.textoValido(nombre)) {
            Dialogos.mostrarError("El nombre no puede estar vacío.");
            return;
        }

        String categoria = Dialogos.pedirTexto("Nueva categoría:");
        if (!Validador.textoValido(categoria)) {
            Dialogos.mostrarError("La categoría no puede estar vacía.");
            return;
        }

        String descripcion = Dialogos.pedirTexto("Nueva descripción:");
        if (!Validador.textoValido(descripcion)) {
            Dialogos.mostrarError("La descripción no puede estar vacía.");
            return;
        }

        String textoPuntuacion = Dialogos.pedirTexto("Nueva puntuación (0-5):");
        if (!Validador.esEntero(textoPuntuacion)) {
            Dialogos.mostrarError("Debes introducir un número entero.");
            return;
        }

        int puntuacion = Validador.convertirEntero(textoPuntuacion);
        if (!Validador.estaEnRango(puntuacion, 0, 5)) {
            Dialogos.mostrarError("La puntuación debe estar entre 0 y 5.");
            return;
        }

        Elemento nuevo = new Elemento(nombre, categoria, descripcion, puntuacion);
        servicio.editarElemento(indice, nuevo);

        Dialogos.mostrarInfo("Elemento editado correctamente.");
    }

    private void mostrar() {

        if (servicio.obtenerTodos().isEmpty()) {
            Dialogos.mostrarInfo("No hay elementos para mostrar.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (Elemento e : servicio.obtenerElementosOrdenados()) {
            sb.append(e.toString()).append("\n----------------------\n");
        }

        Dialogos.mostrarInfo(sb.toString());
    }

    private void eliminar() {

        String textoIndice = Dialogos.pedirTexto("Índice del elemento a eliminar:");
        if (!Validador.esEntero(textoIndice)) {
            Dialogos.mostrarError("Debes introducir un número entero.");
            return;
        }

        int indice = Validador.convertirEntero(textoIndice);

        if (indice < 0 || indice >= servicio.obtenerTodos().size()) {
            Dialogos.mostrarError("El índice no existe.");
            return;
        }

        servicio.eliminarElemento(indice);
        Dialogos.mostrarInfo("Elemento eliminado.");
    }
}
