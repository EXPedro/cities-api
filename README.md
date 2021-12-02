# 🏙️ Cities API 🌆

- __API Rest__ para consulta de cidades do Brasil.   
- Realiza o cálculo da distância entre todas as cidades brasileiras presentes 
neste banco de dados disponibilizado pelo gitUsuário [__Chinnon Santos__](https://github.com/chinnonsantos/sql-paises-estados-cidades).

## Preaprando a base de dados:

### Para criar um container de postgres no docker:

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

### Para popular os dados

```shell script 
docker cp ./dump.sql id_do_container:/docker-entrypoint-initdb.d/dump.sql
```

```shell script 
docker exec -u postgres id_do_container psql -h localhost -U postgres_user_city cities -f dump.sql
```
 
```shell script
psql -h localhost -U postgres_user_city cities
```
## - Tecnologias utilizadas:

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) 

