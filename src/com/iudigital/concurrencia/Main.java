
package com.iudigital.concurrencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que demuestra el uso de la lista de personas
 */
public class Main {

    public static void main(String[] args) {

        // Crear la lista para almacenar nombres de personas.
        List<String> personas = new ArrayList<>();

        // Agregar nonbres a la lista.
        personas.add("Marcos");
        personas.add("Carlos");
        personas.add("Andres");
        personas.add("Fabio");
        personas.add("Tulio");
        personas.add("Franco");
        personas.add("Adela");
        personas.add("Never");
        personas.add("Flor");
        personas.add("Julio");

        // Iterar sobre la lista de personas y mostrar cada nombre en la consola.
        for (String person : personas) {
            System.out.println(personas); // Imprimir el nombre de la persona actual.
        }
    }
}
