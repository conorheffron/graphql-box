# graphql-box

[![Java CI with Maven](https://github.com/conorheffron/graphql-box/actions/workflows/maven.yml/badge.svg)](https://github.com/conorheffron/graphql-box/actions/workflows/maven.yml)

## Technologies:
JDK corretto-17.0.9, Spring Boot 2, GraphQL, Maven 3

## Build & Run Tests:
```
mvn clean package
```

## Run Main Class Directly:
```
com.graphql.box.intro.GraphqlApplication
```

## GraphQL Queries & Mutation (Methods: Postman, Curl, & GraphiQL UI)

### Query

#### curl
```
curl \
--request POST 'localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query {\n    recentPosts(count: 2, offset: 0) {\n        id\n        title\n        author {\n            id\n            posts {\n                id\n            }\n        }\n    }\n}"}'
```
#### GraphiQL UI
![recentPosts-graphiql](./screenshots/recentPosts-graphiql.png?raw=true "recentPosts-graphiql")

#### Postman
![recentPosts-postman](./screenshots/recentPosts-postman.png?raw=true "recentPosts-postman")

### Mutation

#### curl
```
curl \
--request POST 'localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation {\n    createPost(title: \"New Title\", authorId: \"Author2\", text: \"New Text\") {\n id\n       category\n        author {\n            id\n            name\n        }\n    }\n}"}'
```
#### GraphiQL UI
![createPost-graphiql](./screenshots/createPost-graphiql.png?raw=true "recentPosts-graphiql")
