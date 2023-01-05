# **DSMovie**
[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)
[![pt-br](https://img.shields.io/badge/lang-pt--br-green.svg)](./README.pt-br.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](./README.es.md)
  

# Sobre
> DSMovie é uma aplicação full stack desenvolvida durante a semana Spring-React oferecida por DevSuperior - Escola de Programação. (https://devsuperior.com.br/cursos)
>
> Esta aplicação busca um conjunto definido de filmes, mostra-os e permite que o usuário avalie um filme de sua escolha.
>
> [Baseado na semana Spring-React por DevSup ](https://github.com/devsuperior/sds-dsmovie)
>
> [![NPM](https://img.shields.io/npm/l/react)](./LICENSE) 

# Layouts
> ## Página Inicial
> ![first page](./readme/page_1.gif "Página Inicial")
>
> ## Após clicar em um botão avaliar
> ![eval page](./readme/star_a_movie.gif "Página de Avaliação")
>
> ## Página Inicial após avaliar com 5 estrelas um dos filmes.
> ![after eval](./readme/after_eval.gif "Depois de avaliar")

# Models
> ## Arquitetura Spring Boot
> ![Springboot arch](./readme/springboot_arq.gif)  

> ## Modelo do banco de dados
> ![model database](./readme/model_database.gif)

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

# Rodando a aplicação
> ## Back end
> Iniciar Spring Boot (Spring,JPA,Hibernate,Tomcat(port: 8080 http)) via Maven:
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
> Iniciar node webpack em localhost:3000 via Yarn:
>
>        cd frontend
>        yarn start

# Co-autor
> Pedro Vitor Abreu
>
> <soft.pva@gmail.com>
>
> <https://github.com/softpva>
>