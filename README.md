# challenge-spring-boot-literalura
# Librería Kambá

Bienvenido a **Librería Kambá**, una aplicación de gestión de libros que permite interactuar con una base de datos para realizar búsquedas, agregar libros, consultar autores, obtener estadísticas de descargas y mucho más.

## Descripción

**Librería Kambá** es un sistema de gestión de libros que permite realizar las siguientes acciones:

- **Agregar libros** a la base de datos.
- **Buscar libros** por título, autor o idioma.
- **Ver los libros más descargados**.
- **Consultar autores por año**.
- **Acceder a estadísticas** de libros más descargados.

La aplicación se construyó utilizando **Spring Boot** como marco de trabajo principal y **PostgreSQL** como sistema de gestión de base de datos.

## Características

- Interfaz de consola interactiva para seleccionar las acciones a realizar.
- Integración con base de datos PostgreSQL para persistencia de datos.
- Consumo de APIs externas para obtener información adicional sobre libros.

## Instalación

### Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- **JDK 17 o superior**: Para ejecutar la aplicación.
- **PostgreSQL**: Para la base de datos.
- **Maven**: Para gestionar las dependencias del proyecto.

### Pasos para la instalación

1. Clona el repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu_usuario/Literalura.git
   cd Literalura
Abre el archivo src/main/resources/application.properties y configura los detalles de conexión a tu base de datos PostgreSQL

Instala las dependencias del proyecto:
bash
mvn clean install

Ejecuta la aplicación:

bash
mvn spring-boot:run
Accede a la aplicación en el navegador en la URL http://localhost:8080.

Uso
Menú de opciones
Una vez ejecutada la aplicación, se te presentará un menú interactivo en la consola con las siguientes opciones:

css
1 - Agregar Libro por Nombre
2 - Ver Libros buscados
3 - Buscar Libro por Nombre
4 - Mostrar Autores de libros buscados
5 - Buscar Autores por año
6 - Buscar Libros por Idioma
7 - Ver Top 10 Libros más Descargados
8 - Buscar Autor por Nombre
9 - Ayuda
0 - Salir
Ejemplo de uso:
Para agregar un libro, selecciona la opción 1, ingresa los detalles del libro y presiona enter.
Para buscar un libro por nombre, selecciona la opción 3 e ingresa el título.
Tecnologías utilizadas
Spring Boot: Para el desarrollo de la API REST y la gestión del servidor.
PostgreSQL: Base de datos para almacenar libros y autores.
Maven: Para la gestión de dependencias.
Contribuciones
Si deseas contribuir al proyecto, siéntete libre de hacer un fork y abrir pull requests. Asegúrate de seguir las mejores prácticas de desarrollo y mantener la coherencia con el estilo del proyecto.

Licencia
Este proyecto está bajo la Licencia JML. 

¡Gracias por usar Librería Kambá! Si tienes preguntas o sugerencias, no dudes en abrir un issue en GitHub.


