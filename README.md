[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-3-prometheus-grafana/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-3-prometheus-grafana/actions/workflows/maven-build.yml)

# Getting Started

### Requirements:

```
Git: 2.47.1
Spring Boot: 3.4.1
Maven: 3.9+
Java: 17
Docker Desktop: Tested on 4.37.1
```

### Clone this repository:

```bash
git clone https://github.com/spring-boot-3-prometheus-grafana.git
cd spring-boot-3-prometheus-grafana
```

## Configuration Setup

Edit [datasource.yml](monitoring/grafana/provisioning/datasources/datasource.yml)
and [prometheus.yml](monitoring/prometheus/prometheus.yml)
file and add replace YOUR_HOST with your local IP. find your IP using below command and note the IPv4.

```bash
ipconfig
```

Set up a Docker local environment on your laptop by running these commands in the terminal:
Start Grafana and Prometheus and ensure that all services are running:

```bash
docker compose up
   ```

### Build Project:

```bash
./mvnw clean package
```

### (Optional) Build Docker Image(docker should be running):

```bash
./mvnw clean spring-boot:build-image -DskipTests
```

OR

```bash
docker build -t deepaksorthiya/spring-boot-3-prometheus-grafana . 
```

### Run Project:

```bash
./mvnw spring-boot:run
```

### (Optional)Run Using Docker

```bash
docker run --name spring-boot-3-prometheus-grafana -p 8080:8080 deepaksorthiya/spring-boot-3-prometheus-grafana:0.0.1-SNAPSHOT
```

OR

```bash
java -jar .\target\spring-boot-3-prometheus-grafana-0.0.1-SNAPSHOT.jar
```

## Testing

Grafana [http://localhost:3000](http://localhost:3000)
Username: admin Password: admin

Prometheus : [http://localhost:9090](http://localhost:9090/targets)

1. Open Grafana URL and Import this dashboard :
   [spring-boot-statistics](https://grafana.com/grafana/dashboards/19004-spring-boot-statistics/)

2. Open Grafana URL and Import this
   dashboard : [JVM-Micrometer](https://grafana.com/grafana/dashboards/4701-jvm-micrometer/)

More info :
[spring-boot-applications-with-prometheus-and-grafana](https://medium.com/simform-engineering/revolutionize-monitoring-empowering-spring-boot-applications-with-prometheus-and-grafana-e99c5c7248cf)
