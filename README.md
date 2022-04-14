# pw2-quarkus-configuration

## Install:

Maven YAML configuration
```
./mvnw quarkus:add-extension -Dextensions="quarkus-config-yaml"
```

### Add in pom.xml

```
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-config-yaml</artifactId>
</dependency>
```

### Remove the src/main/resources/application.properties and create a src/main/resources/application.yaml file.

### For more informations:
[Quarkus YAML](https://quarkus.io/guides/config-yaml)

In terminal:
```
./mvnw compile quarkus:dev
```
