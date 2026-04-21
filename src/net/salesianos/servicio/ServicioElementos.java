package net.salesianos.servicio;

import java.util.ArrayList;
import java.util.List;
import net.salesianos.elemento.Elemento;

/*
 * Clase que gestiona la lista de elementos del programa.
 * Permite realizar las operaciones del CRUD: añadir, editar, eliminar
 * y obtener los elementos ordenados por puntuación de forma descendente.
 * Actúa como la "lista inteligente" central del sistema.
 */
public class ServicioElementos {

    private List<Elemento> elementos;

    public ServicioElementos() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void editarElemento(int indiceElemento, Elemento elementoEditado) {
        if (indiceElemento >= 0 && indiceElemento < elementos.size()) {
            elementos.set(indiceElemento, elementoEditado);
        }
    }

    public void eliminarElemento(int indiceElemento) {
        if (indiceElemento >= 0 && indiceElemento < elementos.size()) {
            elementos.remove(indiceElemento);
        }
    }

    public List<Elemento> obtenerTodos() {
        return elementos;
    }

    public List<Elemento> obtenerElementosOrdenados() {

        List<Elemento> copiaElementos = new ArrayList<>(elementos);

        for (int indiceActual = 0; indiceActual < copiaElementos.size() - 1; indiceActual++) {
            for (int indiceComparacion = 0; indiceComparacion < copiaElementos.size() - 1
                    - indiceActual; indiceComparacion++) {

                int puntuacionActual = copiaElementos.get(indiceComparacion).getPuntuacion();
                int puntuacionSiguiente = copiaElementos.get(indiceComparacion + 1).getPuntuacion();

                if (puntuacionActual < puntuacionSiguiente) {

                    Elemento elementoTemporal = copiaElementos.get(indiceComparacion);
                    copiaElementos.set(indiceComparacion, copiaElementos.get(indiceComparacion + 1));
                    copiaElementos.set(indiceComparacion + 1, elementoTemporal);
                }
            }
        }

        return copiaElementos;
    }
}
