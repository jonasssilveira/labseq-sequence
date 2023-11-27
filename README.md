# Labseq Sequence

Web application for retrieving values from the labseq sequence.

## Installation

Clone the repository:

```console
$ git clone https://github.com/jonasssilveira/labseq-sequence.git
```

## How To Run (Docker)

Run the following command:

```console
$ docker-compose up
```

Note:

- This process may take a significant amount of time.
- If [Docker](https://www.docker.com/) is not installed, please install it or follow the steps below.

## Prerequisites
- [Docker](https://www.docker.com/) 
- [Node.js](https://nodejs.org/en/) (v14 or higher)
- [Java](https://www.oracle.com/java/) (v17) or [GraalVM](https://www.graalvm.org/downloads/) (21) 
- [Maven](https://maven.apache.org/) (v3.8.6 or higher)
- [Yarn](https://yarnpkg.com/) (v1.22.11 or higher)

## Requirements

Install requirements:

- Inside the `frontend` folder, run:

 ```console
 $ yarn install
 ```
## How To Run

Run the following commands in two separate terminals:

1. Inside the `frontend` folder, run:

```console
$ yarn install 
```
2. Inside the `frontend/labseq-sequence` folder, run:

```console
$ ng serve --open
``` 

## Creating a native executable

1. Inside the `backend` folder, run:

```console
$ ./mvnw package -Dnative
``` 

2. To run the image execute: 
```shell script
docker-compose up 
```

## Bookmarks

- Link to the [Web Application](http://localhost:4200/)
- Link to the [API Documentation](http://localhost:8080/swagger-ui.html#/)

Note:

- To view the API documentation, the backend must be running.

## License
This project is licensed under the [MIT License](LICENSE).