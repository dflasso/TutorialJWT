# TutorialJWT
## Introducción
En el presente repositorio se desarrollo un aplicativo usando 
Spring Boot + Spring Security + JWT + MySQL

Se creo el servidor back-end usando Spring Boot donde usaremos Spring Security junto con la autenticación JWT. Utilizaremos la base de datos MySQL para el almacenamiento.

## Crear la aplicacion
1. Ir al anlace  http://start.spring.io
2. Configurar el proyecto
3. Seleccionar las Dependencias Web, JPA, MySQL and Security.
4. Haga clic en Generar proyecto para generar y descargar el proyecto.
5. Descomprimir al proyecto y agregar las siguientes dependencias

io.jsonwebtoken

com.fasterxml.jackson.datatype


<!-- For Working with Json Web Tokens (JWT) -->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.0</version>
</dependency>

<!-- For Java 8 Date/Time Support -->
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
</dependency>
