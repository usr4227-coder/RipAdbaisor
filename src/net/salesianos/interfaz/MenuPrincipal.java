package net.salesianos.interfaz;

import javax.swing.JOptionPane;

import net.salesianos.util.Dialogos;

public class MenuPrincipal {
    private ServicioElementos servicio;

    public MenuPrincipal(ServicioElementos servicio) {
        this.servicio = servicio;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú principal : \n\n" +
                            "1. Añadir elemento \n" +
                            "2. Editar elemento \n" +
                            "3. Mostrar elementos \n" +
                            "4. Eliminar elemento \n" +
                            "5. Salir \n \n" +
                            "Elige una opción:");
            if (opcion == null)
                continue;
            switch (opcion){
                case "1":
                    agregar();
                    break;
                case "2"
                    editar();
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
                    Dialogos.mostrarError("opcion no válida.");
            }
        }
    }
}
