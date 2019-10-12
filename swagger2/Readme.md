### Swagger2 with Spring Boot POC

#### Build Project
```
mvn clean install
```
#### Run Project

```
mvn spring-boot:run
```

#### Explore Swagger Features

- Swagger Doc in Json format : [Json Format](http://localhost:8080/v2/api-docs)
- Swagger UI : [Swagger UI](http://localhost:8080/swagger-ui.html)

#### Swagger Dependencies

```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

```

#### Used features

```
@EnableSwagger2
Docket Configuration
ApiInfo Configuration
@ApiOperation
@ApiParam
@ApiModel
@ApiModelProperty

```