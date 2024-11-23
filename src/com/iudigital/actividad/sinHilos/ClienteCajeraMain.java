package com.iudigital.actividad.sinHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

import java.util.ArrayList;
import java.util.List;



public class ClienteCajeraMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto clienteUno = new ClienteProducto("Marcos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteTres = new ClienteProducto("Andres", productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajeraUno = new CajeraProducto("Anlly ");
        CajeraProducto cajeraDos = new CajeraProducto("Andrea");
        CajeraProducto cajeraTres = new CajeraProducto("Catalina");

        cajeraUno.ProcesarCompra(clienteUno,tiempoInicial);
        cajeraDos.ProcesarCompra(clienteDos,tiempoInicial);
        cajeraTres.ProcesarCompra(clienteTres,tiempoInicial);

    }


    public static void setProductos(List<Producto> productos) {
        Producto productoUno = new Producto(" Azucar ", 5000, 2);
        Producto productoDos = new Producto(" sal ", 2500, 1);
        Producto productoTres = new Producto(" Arroz ", 2500, 3);
        Producto productoCuatro = new Producto(" Aceite ", 9000, 1);

        productos.add(productoUno);
        productos.add(productoDos);
        productos.add(productoTres);
        productos.add(productoCuatro);
    }
}
