
package com.iudigital.actividad.sinHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase principal que simula el proceso de compra de varios clientes
 * utilizando una cajera que procesa las compras de manera secuencial.
 */
public class ClienteCajeraMain {

    public static void main(String[] args) {

        // Lista para almacenar los productos disponibles.
        List<Producto> productos = new ArrayList<>();

        // Llenar la lista de productos.
        setProductos(productos);

        // Crear instancias de ClienteProducto para diferentes clientes.
        ClienteProducto clienteUno = new ClienteProducto("Marcos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteTres = new ClienteProducto("Andres", productos);

        // Obtener el tiempo inicial en milisegundos
        long tiempoInicial = System.currentTimeMillis();

        // Crear instancias de CajeraProducto para cada cajera.
        CajeraProducto cajeraUno = new CajeraProducto("Anlly ");
        CajeraProducto cajeraDos = new CajeraProducto("Andrea");
        CajeraProducto cajeraTres = new CajeraProducto("Catalina");

        // Procesar las compras de cada cliente de manera secuencial.
        cajeraUno.ProcesarCompra(clienteUno,tiempoInicial);
        cajeraDos.ProcesarCompra(clienteDos,tiempoInicial);
        cajeraTres.ProcesarCompra(clienteTres,tiempoInicial);

    }


    /**
     * Metodo que establece una lista de productos para la compra.
     *
     * @param productos La lista donde se agregaran los productos
     */
    public static void setProductos(List<Producto> productos) {
        // Crear productos con nombre precio y cantidad.
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
