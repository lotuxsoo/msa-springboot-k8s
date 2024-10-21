## 프로젝트 구조
```
.
├── README.md
├── application-common.yml
├── k8s
│   ├── api-gateway
│   │   ├── api-gateway-deployment.yml
│   │   └── api-gateway-service.yml
│   ├── eureka-server
│   │   ├── eureka-server-deployment.yml
│   │   └── eureka-server-service.yml
│   ├── ingress
│   │   └── msa-ingress.yml
│   ├── order-service
│   │   ├── order-service-deployment.yml
│   │   └── order-service.yml
│   └── payment-service
│       ├── payment-service-deployment.yml
│       └── payment-service.yml
├── msa-api-gateway
│   ├── Dockerfile
│   ├── build.gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_api_gateway
│       │   │           └── MsaApiGatewayApplication.java
│       │   └── resources
│       │       └── application.yml
├── msa-eureka-server
│   ├── Dockerfile
│   ├── build.gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_eureka_server
│       │   │           └── MsaEurekaServerApplication.java
│       └── resources
│           └── application.yml
├── msa-order-service
│   ├── Dockerfile
│   ├── build.gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_demo_2
│       │   │           ├── MsaDemo2Application.java
│       │   │           ├── OrderController.java
│       │   │           ├── OrderService.java
│       │   │           └── RabbitMQConfig.java
│       └── resources
│           └── application.yml
├── msa-payment-service
│   ├── Dockerfile
│   ├── build.gradle
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_demo_1
│       │   │           ├── MsaDemo1Application.java
│       │   │           ├── PaymentController.java
│       │   │           ├── PaymentService.java
│       │   │           └── RabbitMQConfig.java
│       └── resources
│           └── application.yml
```