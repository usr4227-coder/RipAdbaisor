package net.salesianos.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.salesianos
import net.salesianos.elemento.Elemento;
import net.salesianos.elemento.Elemento;
import net.salesianos.lacuesta.elemento.Elemento;

public class ServicioElemento {
    rivate List<Elemento>elementos;

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

}
