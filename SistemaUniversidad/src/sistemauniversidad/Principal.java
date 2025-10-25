/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemauniversidad;

/**
 *
 * @author Sandra Martinez
 */
public class Principal {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad Central");

        Profesor prof1 = new Profesor("P1", "Sandra Martinez", "Matemática");
        Profesor prof2 = new Profesor("P2", "Luis Martinez", "Física");
        Profesor prof3 = new Profesor("P3", "Carla Martinez", "Literatura");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Cálculo");
        Curso c3 = new Curso("C3", "Mecánica");
        Curso c4 = new Curso("C4", "Física Moderna");
        Curso c5 = new Curso("C5", "Literatura Contemporánea");

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        universidad.asignarProfesorACurso("C1", "P1");
        universidad.asignarProfesorACurso("C2", "P1");
        universidad.asignarProfesorACurso("C3", "P2");
        universidad.asignarProfesorACurso("C4", "P2");
        universidad.asignarProfesorACurso("C5", "P3");

        System.out.println("\n=== Listado de cursos ===");
        universidad.listarCursos();

        System.out.println("\n=== Listado de profesores ===");
        universidad.listarProfesores();
        
        System.out.println("\n=== Cambiando profesor de C4 a P3 ===");
        universidad.asignarProfesorACurso("C4", "P3");

        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("\n=== Eliminando curso C2 ===");
        universidad.eliminarCurso("C2");
        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("\n=== Eliminando profesor P1 ===");
        universidad.eliminarProfesor("P1");
        universidad.listarCursos();
        universidad.listarProfesores();

        System.out.println("\n=== Cantidad de cursos por profesor ===");
        for (Profesor p : universidad.getProfesores()) {
    System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
}
    }
}