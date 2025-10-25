/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Sandra Martinez
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
  
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro existente = buscarLibroPorIsbn(isbn);
        if (existente != null) {
            System.out.println(" Ya existe un libro con el ISBN: " + isbn);
            return;
        }
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca \"" + nombre + "\".");
            return;
        }
        System.out.println("Lista de libros en la biblioteca \"" + nombre + "\":");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void buscarLibroPorIsbnYMostrar(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            System.out.println("Libro encontrado:");
            libro.mostrarInfo();
        } else {
            System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
        }
    }

    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                libros.remove(i);
                return true;
            }
        }
        System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnioYMostrar(int anio) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año " + anio);
        }
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores disponibles porque no hay libros cargados.");
            return;
        }

        Set<String> autorIds = new HashSet<>();
        System.out.println("Autores disponibles en la biblioteca:");
        for (Libro l : libros) {
            Autor a = l.getAutor();
            if (!autorIds.contains(a.getId())) {
                autorIds.add(a.getId());
                a.mostrarInfo();
            }
        }
    }
}