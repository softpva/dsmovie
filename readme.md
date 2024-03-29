# **DSMovie**
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)
[![pt-br](https://img.shields.io/badge/lang-pt--br-green.svg)](./README.pt-br.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](./README.es.md)
  

# About
> DSMovie is a full stack application developed during Spring-React week hosted by DevSuperior - Escola de Programação. (https://devsuperior.com.br/cursos)
>
> This application fetches a defined set of movies, shows them and allows the user to evaluate each chosen movie.
>
> [Based on Spring-React week by DevSup ](https://github.com/devsuperior/sds-dsmovie)
>
> [![NPM](https://img.shields.io/npm/l/react)](./LICENSE) 


# Layouts
> ## First Page
> ![first page](./readme/page_1.gif "First Page")
>
> ## After clicking the 'Avaliar' button
> ![eval page](./readme/star_a_movie.gif "Eval Page")
>
> ## After setting five stars for a movie
> ![after eval](./readme/after_eval.gif "After eval")

# Models
> ## Spring Boot Architecture
> ![Springboot arch](./readme/springboot_arq.gif)  

> ## Database model
> ![model database](./readme/model_database.gif)

# Tecnologies
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

# Kick off
> ## Back end
> Launch Spring Boot (Spring,JPA,Hibernate,Tomcat(port: 8080 http)) by Maven:
> 
>        cd backend
>        ./mvnw spring-boot:run
>        
> 'Fat' jar:
>
>        cd backend
>        ./mvnw clean install
>        cd target
>        java -jar <artifact-name>.jar
> artifact-name = artifactId + version (on pom.xml)
>
> ## Front end
> Launch node webpack at localhost:3000 by Yarn:
>
>        cd frontend
>        yarn start

# Co-author
> Pedro Vitor Abreu
>
> <soft.pva@gmail.com>
>
> <https://github.com/softpva>
>






