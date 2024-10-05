# Gestión de Tareas

Esta es una aplicación web simple desarrollada con **Java 8**, **Spring Boot MVC**, **MyBatis** para ORM, y **Bootstrap**. La aplicación permite a los usuarios crear y listar tareas a través de una interfaz sencilla y amigable.

## Características

- **Página de Inicio**: Muestra un mensaje de bienvenida y un botón para agregar una nueva tarea.
- **Crear Tarea**: Permite registrar una nueva tarea proporcionando un nombre, descripción y fecha de inicio.
- **Listado de Tareas**: Muestra todas las tareas que se han dado de alta, junto con su nombre, descripción y fecha de inicio.

## Tecnologías Utilizadas

- **Java 8**
- **Spring Boot 2.5.4**
- **MyBatis**: Manejo de la capa de acceso a datos.
- **Maven**: Para la gestión de dependencias.
- **Thymeleaf**: Para la generación de vistas HTML dinámicas.
- **Bootstrap 4.5.2**: Para el diseño de la interfaz de usuario.
- **Base de Datos**: MySQL (puedes reemplazarla por cualquier base de datos soportada por MyBatis).

## Requisitos

Para ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes:

- **Java 8** o superior.
- **Maven** para gestionar el ciclo de vida del proyecto.
- **MySQL** (u otra base de datos de tu elección).
- Un IDE como **IntelliJ IDEA** o **Eclipse**.

## Instalación

#### 1. Clonar el repositorio


`git clone https://github.com/Alexpm27/task-management-technical-test`

#### 2. Configurar la base de datos
Asegúrate de tener una base de datos MySQL y configurar las credenciales en el archivo `application.properties`:

``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

También debes crear la base de datos en MySQL:


``` sql
CREATE DATABASE task_db;
```
#### 3. Instalar dependencias
Usa Maven para descargar las dependencias del proyecto.


``` bash
mvn clean install
```
#### 4. Ejecutar la aplicación
Puedes ejecutar la aplicación con el siguiente comando:

``` bash
mvn spring-boot:run
```
La aplicación estará disponible en http://localhost:8080.

## Uso
#### Página de Inicio
Visita http://localhost:8080 para ver la pantalla de bienvenida.
[![Screenshot-2024-10-05-at-4-43-53-a-m.png](https://i.postimg.cc/RFLd2b4n/Screenshot-2024-10-05-at-4-43-53-a-m.png)](https://postimg.cc/G89vyKBc)
Haz clic en el botón Agregar nueva tarea para ir al formulario de creación de tareas.

#### Crear Tarea
Completa los campos Nombre, Descripción, y Fecha de inicio.
[![Screenshot-2024-10-05-at-4-45-17-a-m.png](https://i.postimg.cc/CMJJNtc3/Screenshot-2024-10-05-at-4-45-17-a-m.png)](https://postimg.cc/Rq6cCP5d)
Haz clic en Agregar para registrar la tarea.

#### Listado de Tareas
Después de agregar una tarea, se te redirigirá automáticamente al Listado de Tareas.
[![Screenshot-2024-10-05-at-4-45-33-a-m.png](https://i.postimg.cc/653c10Sy/Screenshot-2024-10-05-at-4-45-33-a-m.png)](https://postimg.cc/s1k5Mp3r)
Desde esta página, puedes ver todas las tareas registradas.
