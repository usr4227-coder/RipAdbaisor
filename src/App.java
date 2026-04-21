
import net.salesianos.servicio.ServicioElementos;
import net.salesianos.interfaz.MenuPrincipal;

public class App {

    public static void main(String[] args) {

        ServicioElementos servicio = new ServicioElementos();
        MenuPrincipal menu = new MenuPrincipal(servicio);

        menu.iniciar();
    }
}
