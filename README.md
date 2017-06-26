# foo-rest-service

A pointless rest service

## Build

```
mvn clean package
```

## Package 

```
docker build . -t foo-service 
```

## Run

```
docker run -p 8080:8080 foo
```

## Use

```
curl localhost:8080/foo
```