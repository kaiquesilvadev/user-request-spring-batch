# Read data from remote API and save data to DB using Spring Batch
> Estudo de caso para implementar um job para ler dados de uma API remota e salvar no banco de dados usando Spring Batch

## Docker Compose

MySQL 8.0 e phpMyAdmin

Script:

https://github.com/kaiquesilvadev/user-request-spring-batch/blob/main/docker-compose.yml

Subir a estrutura:

``` 
docker-compose up -d
```

Parar a estrutura:
```
docker-compose down
```
#### Dados de conexão para o phpMyAdmin
- Server: mysql-docker
- Usuário: root / user
- Senha: 1234567

#### Dados de conexão para o MySQL Workbench
- Host: 127.0.0.1
- Porta: 3307
- Usuário: root / user
