package com.iudigital.actividad.sinHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;


public class CajeraProducto {


    private String nombre;
    private Producto producto;


    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }


    void ProcesarCompra(ClienteProducto cliente, long timeStamp) {

        System.out.println("la cajera " + this.nombre
        + " comienza aprocesar la compra del cliente "
        + cliente.getNombre() + " en el tiempo de : "
        + (System.currentTimeMillis() - timeStamp)/ 1000 + " segundos " );

        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println(" Procesado el producto " + contCliente
            + " nombre producto " + producto.getNombre()
            + " precio producto " + producto.getPrecio()
            + " cantidad producto " + producto.getCantidad()
            + " costo total del producto " + producto.getCantidad()
            + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos ");
        }

        System.out.println(" la cajera " + this.nombre + " ha terminado de procesar "
        + cliente.getNombre() + " en el tiempo de :"
        + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos ");
        
    }

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
