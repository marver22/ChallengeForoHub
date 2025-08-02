# Challenge - Foro Hub
------



## Descripcion del Proyecto
Foro Hub es una aplicación API de back-end diseñada para gestionar un foro de discusión. 
Permite a los usuarios registrarse, autenticarse y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los tópicos del foro, utilizando JWT para la seguridad.. 
Esta aplicación se desarrolló como parte de la formación en Oracle Next Education (ONE) y Alura Latam, utilizando Java, framework Spring Boot, MySQL.

Ofrece las opciones de realizar EndPoints para los tópicos del Foro Hub:

* **Registro de tópicos:** Permite registrar nuevos tópicos en la base de datos.
* **Listar tópicos:** Muestra todos los tópicos registrados la base de datos.
* **Mostrar datos de un tópico:** Permite ver los detalles de un tópico seleccionado.
* **Modificar un tópico:** Permite actualizar la información de un tópico seleccionado.
* **Eliminar un tópico:** Permite eliminar un tópico de la base de datos.

Además, todo esto está protegido por autenticación utilizando JWT (JSON Web Token) en modo STATELESS.

------
## Funcionalidades
La aplicacion funciona utilizando una API creada desde cero, donde obtenemos informacion de todos los topicos registrados de forma exitosa en la base de datos 
y usuarios que sean autenticados, generando un Token que expira por normas de seguridad hacia la aplicacion. Realiza las siguientes tareas:

1. **Registro de usuarios:** Permite a los usuarios registrarse con su nombre, email y contraseña.
2. **Autenticación y autorización:** Protege las rutas mediante JWT, asegurando que solo los usuarios autenticados puedan acceder a ciertas funcionalidades.
3. **Gestión de tópicos:** Los usuarios pueden crear, ver, actualizar y eliminar tópicos en el foro.
4. **Validación y manejo de errores:** Implementa validaciones en las entradas de datos y maneja errores de forma adecuada.
  
------
## Dependencias Utilizadas.
 En nuestra aplicacion utilizamos las siguientes dependencias en el archivo pom.xml
* spring-boot-starter-data-jpa
* spring-boot-starter-security
* spring-boot-starter-validation
* spring-boot-starter-web
* flyway-core
* flyway-mysql
* spring-boot-devtools
* spring-boot-starter-test
* spring-boot-security-test
* java-jwt
* lombok

------

## Tecnologias utilizadas
* Intellij IDEA Community Edition
* JDK 21
* Java 21
* MySQL 8.0
* Maven
* Spring Boot 4.0.0
* Spring Security
* JWT (JSON Web Token)
* Flyway que nos facilita para migraciones de base de datos

------

## Instalacion y Ejecucion
Para poder instalar la aplicacion, necesitamos los siguientes requisitos:
* Java 21 instalado y su JDK
* MySQL configurado e instalado
* Intellij IDEA o su IDE de preferencia como Eclipse o NetBeans.

------

## Configuracion del proyecto
1. **Clona el repositorio de GitHub**
   ```bash
      git clone [https://github.com/marver22/ChallengeForoHub.git]
   ```
2. **Configuracion la base de datos MySQL:**
   Crea una base de datos llamado "db_forohub"
    
3. **Configuracion de las variables de entorno:**
    Define las siguientes variables de entorno en tu sistema:
      SQL_USERNAME -> tu usuario de MySQL
      SQL_PASSWORD -> tu contraseña de MySQL
      JWT_SECRET -> una clave secreta para JWT
   
4. **Abre el proyecto en IntelliJ IDEA.**

5. **Ejecuta las migraciones utilizando Flyway:**
  Las migraciones se ejecutarán automáticamente al iniciar la aplicación.

7. **Ejecuta la aplicación:**

Atension: Ejecutar la clase ForohubApplication.

------
## Uso de la Aplicacion
1. **Registro y Autenticación:**
```bash
    Usa un cliente de API como Insomnia o Postman.
    POST http://localhost:8080/login: Autentícate y obtén el token JWT.
    Header: Authorization: Bearer <ingresa tu token jwt>.
```

2. **Operaciones CRUD de Tópicos:**
```bash
    POST   http://localhost:8080/topicos:       Crear o registrar un nuevo tópico.
    GET    http://localhost:8080/topicos:       Listar todos los tópicos.
    GET    http://localhost:8080/topicos/{id}:  Obtener detalles de un tópico específico.
    PUT    http://localhost:8080/topicos/{id}:  Actualizar un tópico.
    DELETE http://localhost:8080/topicos/{id}:  Eliminar un tópico.
```

------
## Estado del Proyecto
El proyecto está completo en su versión básica, cuenta con las posibilidades de ampliación para agregar más funcionalidades como otras tablas por ejemplo.

------
## Contribución
Las contribuciones son bienvenidas. Para contribuir, por favor sigue los siguientes pasos:

1. Abre un issue para discutir el cambio que deseas realizar.
2. Haz un fork del repositorio.
3. Abre un Pull Request.

------
## Licencia
Este proyecto está licenciado bajo la Licencia GNU General Public License
