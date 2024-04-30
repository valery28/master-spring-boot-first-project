## Bienvenido a mi primer proyecto en Spring Boot

Primer proyecto en Spring Boot para consumir un endpoint REST. Incluye Health Actuator para monitorear el microservicio.

## Instalación

Instalar la Versión de java 21 o 17. En mi caso utilicé el paquete de instalación de amazon correto 21.
![image](https://github.com/valery28/master-spring-boot-first-project/assets/19556398/10f9d77f-a9f6-471b-9b88-b44639782948)

## Documentación

Para ejectura el programa consumir el servicio REST http://localhost:8080/welcome enviando como parámetro su nombre. Por ejemplo:

{
    "name": "Juan Perez"
}

![image](https://github.com/valery28/master-spring-boot-first-project/assets/19556398/58250a76-e720-4139-8345-ecd43aa7d5c7)

### Health Actuator
Para visualizar el estado de la aplicación se utilizaremos el endpoint health. 
1. Incluirlo en el archivo archivo build.gradle.

![image](https://github.com/valery28/master-spring-boot-first-project/assets/19556398/e8e0dcbe-45f0-4bb3-8274-493ffeaa31e5)

2. Para que nos muestre a detalle la información del endpoint health en application.yaml activar los parametros necesarios.

![image](https://github.com/valery28/master-spring-boot-first-project/assets/19556398/8355ab5f-d287-4d58-892c-0b8bd8369cdd)
