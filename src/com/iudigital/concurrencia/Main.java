package com.iudigital.concurrencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> personas = new ArrayList<>();
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

        for (String person : personas) {
            System.out.println(personas);
        }
    }
}
