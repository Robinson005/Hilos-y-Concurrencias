
package com.iudigital.actividad.cliente;

import java.util.List;


/**
 * Clase que representa un cliente y los productos asociados a él.
 */
public class ClienteProducto {

    private final String nombre;

    private final List<Producto> productos;


    /**
     * Constructor de la clase ClienteProducto.
     * @param nombre  El nombre del cliente.
     * @param productos La lista de productos asociados al cliente.
     */
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los productos del  cliente como arreglo.
     *
     * @return Un arreglo de productos asociados al cliente.
     */
    public Producto[] getProductos() {

     // Este metodo actualmente devuelve un arreglo vacío, debe ser implementado para devolver los productos reales.

        return new Producto[0];
    }
}
