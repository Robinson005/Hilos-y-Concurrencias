
package com.iudigital.actividad.cliente;

/**
 * Clase que representa un productocon un nombre, precio y cantidad.
 */
public class Producto {

    // Nombre del producto.
    private String nombre;

    // Precio del producto.
    private float precio;

    // Cantidad disponible del producto.
    private int cantidad;


    /**
     *  Constructor de la clase producto.
     *
     * @param nombre El nombre del producto
     * @param precio El previo del producto.
     * @param cantidad La cantidad disponible del producto.
     */
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     *  Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establesce el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establese el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     *
     * @return La cantidad disponible del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establese la cantidad disponiblle del producto.
     *
     * @param cantidad La nueva cantidad disponible del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
