
# Red Social de Libros 

# Descripción general

Red Social de Libros es una aplicación full-stack que permite a los usuarios gestionar sus colecciones de libros y participar en una comunidad de entusiastas de la lectura. Ofrece funcionalidades como registro de usuarios, validación segura por correo electrónico, gestión de libros (incluyendo creación, actualización, compartición y archivo), préstamo de libros con verificaciones de disponibilidad, funcionalidad de devolución de libros y aprobación de devoluciones. La aplicación garantiza la seguridad utilizando tokens JWT y sigue las mejores prácticas en el diseño de API REST. El backend está construido con Spring Boot 3 y Spring Security 6, mientras que el frontend se desarrolla utilizando Angular con Bootstrap para el estilo.

## Funcionalidades

- **Registro de usuarios**: Los usuarios pueden registrarse para obtener una nueva cuenta.
- **Validación por correo electrónico**: Las cuentas se activan utilizando códigos de validación segura por correo electrónico.
- **Autenticación de usuarios**: Los usuarios registrados pueden iniciar sesión de forma segura en sus cuentas.
- **Gestión de libros**: Los usuarios pueden crear, actualizar, compartir y archivar sus libros.
- **Préstamo de libros**: Se implementan verificaciones necesarias para determinar si un libro está disponible para ser prestado.
- **Devolución de libros**: Los usuarios pueden devolver los libros prestados.
- **Aprobación de devolución de libros**: Funcionalidad para aprobar las devoluciones de libros.

## Tecnologías utilizadas

- **Spring Boot 3**: Un poderoso framework para construir aplicaciones basadas en Java.
- **Spring Security 6**: Proporciona mecanismos de autenticación y autorización para asegurar la aplicación.
- **Autenticación con Token JWT**: Asegura la comunicación segura entre el cliente y el servidor.
- **Spring Data JPA**: Simplifica el acceso y la persistencia de datos utilizando la API de Persistencia de Java.
- **Spring Validation**: Permite la validación de objetos basada en anotaciones.
- **Documentación OpenAPI y Swagger UI**: Genera documentación para los endpoints de la API.
- **Docker**: Facilita la contenedorización de la aplicación backend para su despliegue.
- **Angular**
- **OpenAPI Generator for Angular**
- **Bootstrap**


## Instrucciones de configuración

Para configurar el backend del proyecto Red Social de Libros, sigue estos pasos:

1. Clona el repositorio:

```bash
   git clone https://github.com/ali-bouali/book-social-network.git
```

2. Ejecuta el archivo docker-compose:

```bash
  docker-compose up -d
```

3. Navega al directorio book-social-network:

```bash
  cd book-social-network
```

4. Instala las dependencias (asumiendo que Maven está instalado):

```bash
  mvn clean install
```

5. Ejecuta la aplicación, pero primero reemplaza `x.x.x` con la versión actual del archivo `pom.xml`:

```bash
  java -jar target/book-network-api-x.x.x.jar
```

6. Accede a la documentación de la API usando Swagger UI:

Abre un navegador web y ve a `http://localhost:8088/swagger-ui/index.html`.
