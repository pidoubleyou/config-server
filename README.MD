# Spring Config Server and Spring Cloud Gateway

research on dynamically adding routes to Spring Cloud Gateway

## Config Server

* runs on port 8088
* loads config from user profile

## Cloud Gateway

* uses config server to load configuration
* sample route: `http://localhost:8080/articles/spring-cloud-gateway`

## Research

* show configured routes: `http://localhost:8080/actuator/gateway/routes`
* refresh configuration: `http://localhost:8080/actuator/refresh`

### adding new routes using config server

* add route to yml delivered by config server
* refresh configuration
* problem: one route config used

### multiple profiles

* problem: profile name required at startup of gateway

### using gateway api

### using discovery?
