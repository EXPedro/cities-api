# Cities API

Projeto de API Rest para consulta de cidades do Brasil. Projeto desenvolvido durante o *bootcamp* da TQI, com
orientação do especialista [André Gomes](https://www.linkedin.com/in/andreluisgomes/).
Durante o desenvolvimento foram repassadas boas práticas de Java e do Spring, foi populado o bando de dados postgres 
em um container *docker*. Com o uso da especificação JPA, foi feito o mapeamento do banco de dados com o framework 
*hibernate*. Também foi criado um serviço para o cálculo da distância entre todas as cidades brasileiras presentes 
[neste banco de dados](https://github.com/chinnonsantos/sql-paises-estados-cidades).

## DataBase

### Postgres

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

### Popular dados

```shell script 
docker cp ./dump.sql id_do_container:/docker-entrypoint-initdb.d/dump.sql
```

```shell script 
docker exec -u postgres id_do_container psql -h localhost -U postgres_user_city cities -f dump.sql
```
 
```shell script
psql -h localhost -U postgres_user_city cities
```
##### Java | Spring | Postgres | Hibernate | Docker | Postman 

> Projeto concluído em 11/2021.