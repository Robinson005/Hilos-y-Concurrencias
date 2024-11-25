
package com.iudigital.actividad.conHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que inicia el proceso de compra de varios clientes
 * utilizando los hilos para simular el trabajo de cajeras.
 */
public class ClienteCajeraHilosMain {

    public static void main(String[] args) {
        // Lista para almacenar los productos disponibles.
        List<Producto> productos = new ArrayList<>();

        // Llenar la lista de productos.
        setProductos(productos);

        // Crear instancias de ClienteProducto para diferentes clientes
        ClienteProducto clienteUno = new ClienteProducto("Marcos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteTres = new ClienteProducto("Andres", productos);

        // Obtener el tiempo inicial en milisegundos.
        long tiempoInicial = System.currentTimeMillis();

        // Crear hilos de cajeras para cada cliente.
        CajeraProductoHilos cajeraUno = new CajeraProductoHilos(" Anlly ", clienteUno, tiempoInicial);
        CajeraProductoHilos cajeraDos = new CajeraProductoHilos(" Andrea ",clienteDos, tiempoInicial);
        CajeraProductoHilos cajeraTres = new CajeraProductoHilos(" Catalina ", clienteTres, tiempoInicial);

        // Iniciar el procesamiento de compras en hilos separados.
        cajeraUno.start();
        cajeraDos.start();
        cajeraTres.start();
    }

    /**
     * Metodo que establece una lista de productos para la compra.
     *
     * @param productos La lista de donde se agregaran los productos.
     */
    public static void setProductos(List<Producto> productos) {

        // Crear productos con nombre, precio y cantidad.

        Producto productoUno = new Producto(" Azucar ", 5000, 2);
        Producto productoDos = new Producto(" sal ", 2500, 1);
        Producto productoTres = new Producto(" Arroz ", 2500, 3);
        Producto productoCuatro = new Producto(" Aceite ", 9000, 1);

        // Agregar los productos a la lista.
        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
        productos.add(productoCuatro);
    }
}
