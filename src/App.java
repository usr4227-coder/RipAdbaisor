import net.salesianos.servicio.ServicioElementos;
import net.salesianos.interfaz.MenuPrincipal;

/*
 * Clase principal de la aplicación.
 * Crea el servicio y el menú principal, y da inicio al programa.
 * Actúa como punto de entrada del sistema.
 */
public class App {

    public static void main(String[] args) {

        ServicioElementos servicio = new ServicioElementos();
        MenuPrincipal menu = new MenuPrincipal(servicio);

        menu.iniciar();
    }
}
