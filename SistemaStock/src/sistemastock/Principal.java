/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemastock;

/**
 *
 * @author Sandra Martinez
 */

public class Principal {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz", 1500, 10, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 18000, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Licuadora", 50000, 3, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 2500, 15, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.agregarProducto("P006", "Galletitas", 400, 25, CategoriaProducto.ALIMENTOS);

        System.out.println("=== Lista de Productos ===");
        inventario.listarProductos();

        System.out.println("=== Buscar Producto por ID 'P003' ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("=== Filtrar por categoría ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        System.out.println("=== Eliminar producto con ID 'P004' ===");
        inventario.eliminarProducto("P004");

        System.out.println("=== Lista de productos después de eliminar ===");
        inventario.listarProductos();
        
        System.out.println("=== Actualizar stock de producto 'P003' a 30 unidades ===");
        inventario.actualizarStock("P003", 30);

        System.out.println("=== Total de stock ===");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println("=== Producto con mayor stock ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("=== Filtrar productos por precio entre $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();

    }
}