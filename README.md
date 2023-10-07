# spring-boot-prometheus-grafana

## Quick start

Edit [datasource.yml](https://github.com/deepaksorthiya/spring-boot-prometheus-grafana/blob/master/monitoring/grafana/provisioning/datasources/datasource.yml) and [prometheus.yml](https://github.com/deepaksorthiya/spring-boot-prometheus-grafana/blob/master/monitoring/prometheus/prometheus.yml) file and add replace YOUR_HOST with your local IP

Set up a Docker local environment on your laptop by running these commands in the terminal:

1. Start Grafana and Prometheus and ensure that all services are running:
    ```bash
    docker compose up
   ```
2. Start Spring boot app:
    ```bash
    mvn spring-boot:run
   ```   
Grafana [http://localhost:3000](http://localhost:3000)
Username: admin Password: admin

Prometheus : [http://localhost:9090](http://localhost:9090/targets)

Open Grafana URL and Import this dashboard : 
[spring-boot-statistics](https://grafana.com/grafana/dashboards/19004-spring-boot-statistics/)

More info : 
[spring-boot-applications-with-prometheus-and-grafana](https://medium.com/simform-engineering/revolutionize-monitoring-empowering-spring-boot-applications-with-prometheus-and-grafana-e99c5c7248cf)
