## Prérequis

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Etapes à suivre

**1. Cloner le projet**

```bash
git clone https://github.com/franck30/noteRestApi.git

```

**2. Créer la base de donnees MYSQL**
```bash
create database notes_app
```

**3. Changer le username et le mot de passe mySql pour correspondre a votre installation**


+ ouvrir `src/main/resources/application.properties`

+ changer `spring.datasource.username` et `spring.datasource.password` pour correspondre a votre installation mySql

**4. Compiler et lancer le projet avec Maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Autre alternative, lancer le projet sans le packager avec cette commande -

```bash
mvn spring-boot:run
```

l'application sera lancée a l'adresse <http://localhost:8080>.

## Explorer les APIs REST

L'application expose les api REST suivantes.

    GET /api/notes
    
    POST /api/notes
    
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

Vous pouvez les tester en utilisant Postman ou tout autre client REST.
