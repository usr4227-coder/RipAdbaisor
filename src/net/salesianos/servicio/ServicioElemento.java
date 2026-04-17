package net.salesianoslacuesta.servicio;

import java.util.ArrayList;
import java.util.List;

import net.salesianoslacuesta.elemento.Elemento;

<<<<<<< HEAD
public class ServicioElemento {
=======
public class ServicioElementos {

    private List<Elemento> elementos;

    public ServicioElementos() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void editarElemento(int indice, Elemento nuevoElemento) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.set(indice, nuevoElemento);
        }
    }

    public void eliminarElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.remove(indice);
        }
    }

    public List<Elemento> obtenerTodos() {
        return elementos;
    }

    public List<Elemento> obtenerElementosOrdenados() {
        List<Elemento> copia = new ArrayList<>(elementos);

        for (int i = 0; i < copia.size() - 1; i++) {
            for (int j = 0; j < copia.size() - 1 - i; j++) {

                int puntuacionActual = copia.get(j).getPuntuacion();
                int puntuacionSiguiente = copia.get(j + 1).getPuntuacion();

                if (puntuacionActual < puntuacionSiguiente) {

                    Elemento temporal = copia.get(j);
                    copia.set(j, copia.get(j + 1));
                    copia.set(j + 1, temporal);
                }
            }
        }

        return copia;

    }
>>>>>>> servicio

}
