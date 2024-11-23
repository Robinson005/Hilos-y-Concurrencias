
package com.iudigital.actividad.cliente;

import java.util.List;


public class ClienteProducto {

    private final String nombre;

    private final List<Producto> products;


    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.products = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return new Producto[0];
    }
}