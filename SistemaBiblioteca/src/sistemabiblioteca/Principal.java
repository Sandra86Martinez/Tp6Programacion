/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Sandra Martinez
 */
public class Principal {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor garciaMarquez = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor cortazar = new Autor("A2", "Julio Cortázar", "Argentino");
        Autor allende = new Autor("A3", "Isabel Allende", "Chilena");

        biblioteca.agregarLibro("L1", "Cien años de soledad", 1967, garciaMarquez);
        biblioteca.agregarLibro("L2", "El amor en los tiempos del cólera", 1985, garciaMarquez);
        biblioteca.agregarLibro("L3", "Rayuela", 1963, cortazar);
        biblioteca.agregarLibro("L4", "La casa de los espíritus", 1982, allende);
        biblioteca.agregarLibro("L5", "Paula", 1994, allende);

        System.out.println("\n=== Listado de libros ===");
        biblioteca.listarLibros();

        System.out.println("\n=== Buscar libro por ISBN ===");
        biblioteca.buscarLibroPorIsbnYMostrar("L3");

        System.out.println("\n=== Libros publicados en 1982 ===");
        biblioteca.filtrarLibrosPorAnioYMostrar(1982);


        System.out.println("\n=== Eliminando libro con ISBN 'L2' ===");
        biblioteca.eliminarLibro("L2");
        biblioteca.listarLibros();

        System.out.println("\n=== Cantidad total de libros ===");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n=== Autores disponibles ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
