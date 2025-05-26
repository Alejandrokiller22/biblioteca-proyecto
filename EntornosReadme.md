# 📚 Proyecto de Gestión de Libros - Entornos de Desarrollo

Este proyecto consiste en una aplicación Java con interfaz gráfica (Swing) que permite gestionar libros (insertar, buscar, etc.) conectándose a una base de datos MySQL. Está desarrollado como parte de la práctica de la asignatura Entornos de Desarrollo.

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
- Organización mediante ramas cuando ha sido necesario.

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
  - Contraseña: *la mia*
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
