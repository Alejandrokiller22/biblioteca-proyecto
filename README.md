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



# 📚 Proyecto de Gestión de Libros - Entornos de Desarrollo

Este proyecto consiste en una aplicación Java con interfaz gráfica (Swing) que permite gestionar libros (insertar, buscar, etc.) conectándose a una base de datos MySQL. Está desarrollado como parte de la práctica de la asignatura *Entornos de Desarrollo*.

---

## ⚙ Tecnologías Utilizadas

- Java (JDK 8 o superior)
- Swing para la interfaz gráfica
- MySQL como sistema gestor de bases de datos (SGBD)
- JDBC para la conexión con la base de datos
- JUnit 4 para pruebas unitarias
- Eclipse como entorno de desarrollo
- Git y GitHub para control de versiones

---

## ✔ Control de Versiones

- Proyecto versionado con Git.
- Se ha trabajado en un repositorio GitHub compartido.
- Uso de commits frecuentes y descriptivos.
- Organización mediante ramas si es necesario.

---

## 🧪 Pruebas unitarias

- Se han implementado pruebas unitarias con JUnit para verificar:
  - La conexión con la base de datos (`ConexionMySQL`)
  - El correcto funcionamiento de las clases DAO
- La librería JUnit ha sido gestionada manualmente (añadiendo el `.jar` al proyecto).

---

## 🐞 Depuración y Refactorización

- Se ha utilizado el depurador de Eclipse para encontrar y resolver errores.
- Se han aplicado técnicas de refactorización para mejorar la estructura del código y su mantenibilidad.

---

## ✔ Calidad de Código

- Se siguen las convenciones de codificación de Java.
- Código limpio, indentado y comentado.
- Uso adecuado de nombres de variables, clases y métodos.

---

## 📄 Documentación JavaDoc

- Se ha generado documentación JavaDoc para las clases públicas y sus métodos.

---

## 📘 Configuración del Proyecto

### Requisitos:

- Tener instalado Java JDK y Eclipse.
- Tener instalado MySQL Server y creado un esquema llamado `biblioteca`.

### Conexión JDBC:

- El proyecto utiliza una clase `ConexionMySQL` para establecer la conexión con:
  - Usuario: `root`
  - Contraseña: *(mi contraseña)*
  - Base de datos: `biblioteca`
- Asegúrate de añadir el conector `mysql-connector-java-x.x.x.jar` en:
  - **Project > Properties > Java Build Path > Add External JARs**

### Ejecución:

1. Importa el proyecto en Eclipse.
2. Verifica que el driver JDBC está añadido correctamente.
3. Ejecuta la clase `Ventana_Insertar` para probar la interfaz.
4. Puedes ejecutar `LibroDAOTest.java` para validar la conexión con JUnit.

---

## ✅ Autor

Práctica realizada por Alejandro Garcia-Mauriño Salas y Antonio Toro del Moro para la asignatura **Entornos de Desarrollo**.












