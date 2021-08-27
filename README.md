# Database Setup

## View ER diagram
To view the ER diagram, open it in draw.io

## Docker Postgres Setup
Create a postgres docker instance:
https://hub.docker.com/_/postgres

run the docker container
```
docker run --name postgres-main -e POSTGRES_PASSWORD=test -p 5432:5432 -d postgres

```

connect to docker instance:
```
docker exec -it postgres-main psql -U postgres

```

create the database climbing_training:
```
CREATE DATABASE climbing_training;

```

check it was created
```
\l
```

Stop container
```
docker stop postgres-main
docker rm postgres-main

```

## Application Database Setup
For these steps, you must navigate to the directory of the sql scripts.

Create and set-up the tables:
```
docker cp create_tables.sql postgres-main:/create_tables.sql
docker exec -it postgres-main psql -d exercise_dev -f create_tables.sql -U postgres
```

Create and set-up the data:
```
docker cp insert_data.sql postgres-main:/insert_data.sql
docker exec -it postgres-main psql -d exercise_dev -f insert_data.sql -U postgres
```



docker rm postgres-main
docker run --name postgres-main -e POSTGRES_PASSWORD=test -p 5432:5432 -d postgres
docker exec -it postgres-main psql -U postgres

CREATE DATABASE climbing_training;

Next steps
- change the order of the season to being returned so all asociated day sessions come through
- clean up
- Session exercise copy is not in order judging by ids
- Maybe change the status updates so only existing parents are checked