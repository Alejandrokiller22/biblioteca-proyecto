# biblioteca-proyecto
En este repositorio veremos el Proyecto Final de la 3 evaluación donde estarán subidos los ejercicios pedidos por los docentes.
BASE DE DATOS
1. Selección del SGBD (Sistema de Gestión de Base de Datos)
Para este proyecto he elegido MySQL como sistema de gestión de base de datos.  Es un sistema muy utilizado, gratuito, fácil de integrar con Java (a través de JDBC), y suficiente para un proyecto de biblioteca como este.
2. Diseño del Esquema Relacional
Creamos una tabla principal llamada libros, normalizada para representar los libros de una biblioteca. Incluye los siguientes campos:
3. Inserción de Datos de Ejemplo (DML)
Para comprobar que la base de datos funciona correctamente y que las consultas devuelven datos reales, he insertado ejemplos de libros en la tabla 
libros utilizando sentencias INSERT. He añadido 7 libros de diferentes géneros como ciencia ficción, terror, aventuras, clásicos y fantasía.
4. Procedimientos Almacenados (versión simplificada para presentación)
Hemos creado dos procedimientos que sirven para gestionar si un libro está disponible o no, sin repetir código.
Prestar libro         Devolver libro
Procedimientos realizados:

5. Disparadores (Triggers)
Creamos un trigger que guarda un historial cada vez que se elimina un libro:
Tabla para guardar historial:
Aquí se puede ver la tabla  creada con las especificaciones que le decimos que son Id,Titulo, FechaEliminación.

Trigger asociado con la tabla creada:

Esto permite conservar un registro de los libros eliminados.
Aquí se puede ver el Trigger creado correctamente:


Aquí se puede editar el Trigger:

6. Modelado de Datos Complejos
Como MySQL no permite tipos objetos, representamos relaciones complejas usando una tabla generos, donde un libro puede tener varios géneros:


Ejemplo de inserción de géneros:

Esto representa una relación de uno a muchos entre libros y géneros.
Podemos visualizar esta tabla desde phpMyAdmin con esta consulta:











