package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(2, "Ramos");
        map.put(3, "Pique");
        map.put(4, "Puyol");
        map.put(5, "Capdevila");
        map.put(6, "Xabi Alonso");
        map.put(7, "Busquets");
        map.put(8, "Xavi Hernandez");
        map.put(9, "Pedrito");
        map.put(10, "Iniesta");
        map.put(11, "Villa");
        map.put(12, "Andres");
        map.put(13, "Daniel");
        map.put(14, "Alejandro");
        map.put(15, "Angel");
        map.put(16, "Adrian");

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int) it.next();
            String nombre = map.get(key);
            if (key % 2 != 0) {
                map.put(key, nombre+key);
            }

            System.out.println("Nombre: " + map.get(key));

        }
    }
}