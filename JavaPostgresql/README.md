# Conexionn Postgres con Java (JDBC)

## Docker

| Comandos                                                                                                                                    | Descripcion                   |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| `docker run -d --name postgres-java -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=ejercicio postgres` | Crear contenedor con postgres |
| `docker exec -it postgres-java bash`                                                                                                        | Consola de la base de datos   |

## Postgres

| Comandos                                     | Descripcion                |
| -------------------------------------------- | -------------------------- |
| `psql -U postgres --password --db ejercicio` | Ingresar a la BD ejercicio |
