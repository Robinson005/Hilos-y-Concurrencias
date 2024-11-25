
package com.iudigital.actividad.sinHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;


/**
 *  Clase que representa una cajera que procesa la compra de productos de un cliente.
 */
public class CajeraProducto {

    //Nombre de la cajera.
    private String nombre;

    // Producto que se está procesando (no se utiliza en este contexto)
    private Producto producto;


    /**
     *  Constructor de la clase CajeraProducto.
     *
     * @param nombre El nombre de la cajera.
     */
    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Metodo que procesa la compra de un cliente.
     *
     * @param cliente El cliente cuya compra se está procesando.
     * @param timeStamp El tiempo inicial en milisegundos cuando se comienza a procesar la compra.
     */
    void ProcesarCompra(ClienteProducto cliente, long timeStamp) {
        // Mensaje inicial indicando que la cajera ha comenzado a procesar la compra.
        System.out.println("la cajera " + this.nombre
        + " comienza a procesar la compra del cliente "
        + cliente.getNombre() + " en el tiempo de : "
        + (System.currentTimeMillis() - timeStamp)/ 1000 + " segundos " );

        int contCliente = 1; // Contador para los productos del cliente.
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos(); // Simula el tiempo de procesamiento de cada producto.
            System.out.println(" Procesado el producto " + contCliente
            + " nombre producto " + producto.getNombre()
            + " precio producto " + producto.getPrecio()
            + " cantidad producto " + producto.getCantidad()
            + " costo total del producto " + producto.getCantidad()
            + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos ");
        contCliente++; //Incrementa el contador de productos;
        }

        // Mensaje final indicando que la cajera ha terminado de procesar la compra.
        System.out.println(" la cajera " + this.nombre + " ha terminado de procesar "
        + cliente.getNombre() + " en el tiempo de :"
        + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos ");
        
    }

    /**
     *  Metodo que simula una espera de 1 segundo.
     */
    private void esperarXSegundos() {
        try {
            Thread.sleep(1000); // Pausa el hilo durante 1 segundo.
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // Lanza una exepcion si ell hilo se interrumpio.
        }
    }
}
