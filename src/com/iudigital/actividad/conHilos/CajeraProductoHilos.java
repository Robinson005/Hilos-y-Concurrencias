
package com.iudigital.actividad.conHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;


/**
 * Clase que representa una cajera que procesa productos de un cliente en un hilo separado.
 */
public class CajeraProductoHilos extends Thread{


    //Nombre de la cajera.
    private String nombre;

    //Cliente al que se le están procesando los productos.
    private ClienteProducto cliente;

    // Tiempo inicial en milisegundos cuando se comienza a procesar la compra
    private long tiempoInicial;

    /**
     * Constructor de la clase CajeraProductoHilos.
     *
     * @param nombre  El nombre de la cajera.
     * @param cliente  El cliente cuyos products se están processando.
     * @param tiempoInicial
     */
    public CajeraProductoHilos(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     *  Metodo que se ejecuta cuando se inicia el hilo.
     *  Pocesa la compra del cliente y muestra el tiempo transcurrido.
     */
    public void run() {
        System.out.println(" La cajera " + this.nombre
        + " comienza a procesar la compra del cliente "
        + this.cliente.getNombre() + " en el tienpo de: "
        + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");

        int contCliente = 1;  //Contador para los productos del cliente.
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();  //Simula el tiempo de procesamiento de cada producto.
            System.out.println(" Procesado el producto " + contCliente
            + " nombre producto " + producto.getNombre()
            + " precio producto " + producto.getPrecio()
            + " cantidad productos " + producto.getCantidad()
            + " costo total del producto " + producto.getCantidad()
            + " -> Tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");
            contCliente++;  //Inicia el contador de productos.
        }

        System.out.println("La cajera " + this.nombre + " ha terminado dde procesar "
        + this.cliente.getNombre() + " en el tiempo de: "
        + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");
    }

    /**
     * Metodo que simula una espera de 1 segundo.
     */
    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);  // Pausa el hilo durante 1 segundo.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);  // Lanza una exepción si el hilo es interrumpido.
        }
    }
}
