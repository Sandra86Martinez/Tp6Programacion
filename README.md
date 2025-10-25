\# PROGRAMACIÓN II - TRABAJO PRÁCTICO 6: COLECCIONES Y POO AVANZADA



Este repositorio contiene las soluciones para Práctica 6, enfocado en el uso de estructuras de datos dinámicas en Java y la implementación de relaciones complejas en el paradigma Orientado a Objetos (POO).



---



\## Objetivos y Temas Clave



El trabajo se divide en tres ejercicios principales, que refuerzan los siguientes conceptos:



\### 1. Sistema de Stock e Inventario (Base)



\-   \*\*Uso de `ArrayList`:\*\* Estructura principal para gestionar la colección de `Productos`.

\-   \*\*`Enum` Avanzado:\*\* Uso de enumeraciones (`CategoriaProducto`) con métodos y descripciones.

\-   \*\*Funcionalidad:\*\* Implementación de búsqueda, filtrado, actualización de stock y reportes (`mayorStock`, `totalStock`).



\### 2. Biblioteca y Libros (Composición)



\-   \*\*Relación 1 a N (Composición):\*\* Modelado de la relación donde una `Biblioteca` contiene múltiples `Libros`, demostrando que los objetos internos dependen del objeto contenedor.

\-   \*\*Clase Autor:\*\* Uso de objetos complejos como atributos (`autor` dentro de `Libro`).



\### 3. Sistema Académico (Relación Bidireccional)



\-   \*\*Bidireccionalidad:\*\* Modelado de una relación `Profesor` ↔ `Curso` (1 a N).

\-   \*\*Invariantes de Asociación:\*\* Implementación de métodos "seguros" que \*\*sincronizan la relación\*\* automáticamente (si se asigna un profesor a un curso, el curso se añade a la lista del profesor, y viceversa).

\-   \*\*Modularidad:\*\* Uso de la clase `Universidad` como gestor central de todas las colecciones.



---



\## Estructura del Proyecto



El código está organizado en los paquetes y clases correspondientes a cada caso práctico.



| Paquete / Caso | Clases Principales | Relación Demostrada |

| :--- | :--- | :--- |

| \*\*`stock`\*\* | `Producto`, `CategoriaProducto`, `Inventario` | `ArrayList` y `enum` |

| \*\*`biblioteca`\*\* | `Biblioteca`, `Libro`, `Autor` | Composición (Dependencia 1:N) |

| \*\*`academico`\*\* | `Profesor`, `Curso`, `Universidad` | Bidireccionalidad (Sincronización) |



