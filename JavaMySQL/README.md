# Conexion Java con MySQL

- Conector [MySQL](https://dev.mysql.com/downloads/connector/j/)

## Docker

| Comandos                                                                         | Descripcion                         |
| -------------------------------------------------------------------------------- | ----------------------------------- |
| `docker run -d --name mysql-java -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 mysql` | Crear contenedor con mysql.         |
| `docker exec -it mysql-java bash`                                                | Consola del contenedor.             |
| `docker cp ruta-archivo-original mysql-java:ruta-archivo-copia`                  | Copiar carpeta hacia el contenedor. |

## MySQL

| Comandos                                                              | Descripcion                                                                                                     |
| --------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `CREATE USER 'redis'@'localhost' IDENTIFIED BY 'redis';`              | Crea usuario que puede conectarse desde la máquina local.                                                       |
| `CREATE USER 'redis'@'%' IDENTIFIED BY 'redis';`                      | Crea usuario que permite conexiones desde cualquier host.                                                       |
| `GRANT ALL PRIVILEGES ON . TO 'redis'@'localhost' WITH GRANT OPTION;` | Da privilegios completos al usuario redis, permite dar estos privilegios a otros usuarios                       |
| `GRANT ALL PRIVILEGES ON . TO 'redis'@'%' WITH GRANT OPTION;`         | Da privilegios completos al usuario redis, permite dar estos privilegios a otros usuarios desde cualquier host. |
| `FLUSH PRIVILEGES;`                                                   | Vuelva a cargar la información de privilegios de usuario desde su archivo de configuración.                     |

## Consola contenedor

| Comandos                              | Descripcion                   |
| ------------------------------------- | ----------------------------- |
| `mysqlsh -u root -p`                  | Ingresar a la consola MySQL   |
| `mysql -u root -p -t < employees.sql` | Ejecutar el archivo employees |
