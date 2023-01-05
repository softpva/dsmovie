# **DSMovie**
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)
[![pt-br](https://img.shields.io/badge/lang-pt--br-green.svg)](./README.pt-br.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](./README.es.md)

# Acerca de
> DSMovie es una aplicación full stack desarrollada durante la semana Spring-React ofrecida por DevSuperior - Escola de Programação. (https://devsuperior.com.br/cursos)
>
> Esta aplicación obtiene un conjunto definido de películas, las muestra y permite al usuario calificar una película de su elección.
>
> [Basado en la semana Spring-React de DevSup](https://github.com/devsuperior/sds-dsmovie)
>
> [![NPM](https://img.shields.io/npm/l/react)](./LICENSE) 

# diseños
> ## Página de inicio
> ![primera página](./readme/page_1.gif "Página inicial")
>
> ## Después de hacer clic en un botón 'Avaliar'
> ![página de evaluación](./readme/star_a_movie.gif "Página de evaluación")
>
> ## Página de inicio después de calificar una de las películas con 5 estrellas.
> ![después de la evaluación](./readme/after_eval.gif "Después de la evaluación")

# Modelos
> ## Arquitectura Spring Boot
> ![Springboot arch](./readme/springboot_arq.gif)  

> ## Modelo de base de datos
> ![base de datos modelo](./readme/model_database.gif)

# Tecnologias
> ## Back end
> - Java
> - H2 (dev)
> - PostgreSQL (deploy)
> - Spring Boot
>   - Spring Initializr dependencies:
>     - WEB
>     - JPA
>     - H2
>     - Postgres
>     - Security
> - JPA
> - Hibernate
> - Tomcat
> - Maven
>
> ## Front end
> - HTML5 (HTML,CSS,JS,TS)
> - Bootstrap
> - React (TS)
> - Yarn
> - Node

# Ejecutando la aplicación
> ## Back end
> Inicie Spring Boot (Spring, JPA, Hibernate, Tomcat (puerto: 8080 http)) mediante Maven:
> 
>        cd backend
>        ./mvnw spring-boot:run
> 
> Ou
>       
> 'Fat' jar:
>
>        cd backend
>        ./mvnw clean install
>        cd target
>        java -jar <artifact-name>.jar
> artifact-name = artifactId + version (em pom.xml)
>
> ## Front end
> Inicie node webpack en localhost:3000 mediante Yarn:
>
>        cd frontend
>        yarn start

# Coautor
> Pedro Vitor Abreu
>
> <soft.pva@gmail.com>
>
> <https://github.com/softpva>
>