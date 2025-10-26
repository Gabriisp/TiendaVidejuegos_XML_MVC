package com.example.view;

import java.util.List;
import java.util.Scanner;

import com.example.model.Periferico;
import com.example.model.Videojuego;

public class TiendaVista {
    private Scanner sc = new Scanner(System.in);

    public void mostrarOpciones() {
    System.out.println("\n Menú Tienda");
    System.out.println("1. Ver videojuegos");
    System.out.println("2. Añadir videojuego");
    System.out.println("3. Ver periféricos");
    System.out.println("4. Añadir periférico");
    System.out.println("5. Borrar videojuego");
    System.out.println("6. Borrar periférico");
    System.out.println("7. Salir");
    System.out.print("Seleccione una opción: ");
}


     public int leerOpcion() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1; // opción inválida
        }
    }

    public void mostrarVideojuegos(List<Videojuego> lista) {
        System.out.println("\n Lista de Videojuegos ");
        for (Videojuego v : lista) {
            System.out.println("ID: " + v.getId() + " | Nombre: " + v.getNombre() + " | Precio: " + v.getPrecio());
        }
    }

    public void mostrarPerifericos(List<Periferico> lista) {
        System.out.println("\n Lista de Periféricos ");
        for (Periferico p : lista) {
            System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Tipo: " + p.getTipo()
                    + " | Precio: " + p.getPrecio());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    
}
