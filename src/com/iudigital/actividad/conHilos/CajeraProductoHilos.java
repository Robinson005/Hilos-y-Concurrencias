package com.iudigital.actividad.conHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;



public class CajeraProductoHilos extends Thread{

    private String nombre;

    private ClienteProducto cliente;

    private long tiempoInicial;

    public CajeraProductoHilos(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public void run() {
        System.out.println(" La cajera " + this.nombre
        + " comienza a procesar la compra del cliente "
        + this.cliente.getNombre() + " en el tienpo de: "
        + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");

        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXSegundos();
            System.out.println(" Procesado el producto " + contCliente
            + " nombre producto " + producto.getNombre()
            + " precio producto " + producto.getPrecio()
            + " cantidad productos " + producto.getCantidad()
            + " costo total del producto " + producto.getCantidad()
            + " -> Tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");
            contCliente++;
        }

        System.out.println("La cajera " + this.nombre + " ha terminado dde procesar "
        + this.cliente.getNombre() + " en el tiempo de: "
        + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " segundos ");
    }

    private void esperarXSegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
