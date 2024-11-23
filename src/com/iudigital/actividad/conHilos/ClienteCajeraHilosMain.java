package com.iudigital.actividad.conHilos;

import com.iudigital.actividad.cliente.ClienteProducto;
import com.iudigital.actividad.cliente.Producto;

import java.util.ArrayList;
import java.util.List;

public class ClienteCajeraHilosMain {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto clienteUno = new ClienteProducto("Marcos", productos);
        ClienteProducto clienteDos = new ClienteProducto("Carlos", productos);
        ClienteProducto clienteTres = new ClienteProducto("Andres", productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraProductoHilos cajeraUno = new CajeraProductoHilos(" Anlly ", clienteUno, tiempoInicial);
        CajeraProductoHilos cajeraDos = new CajeraProductoHilos(" Andrea ",clienteDos, tiempoInicial);
        CajeraProductoHilos cajeraTres = new CajeraProductoHilos(" Catalina ", clienteTres, tiempoInicial);


        cajeraUno.start();
        cajeraDos.start();
        cajeraTres.start();
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
