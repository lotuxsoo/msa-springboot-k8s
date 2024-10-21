## 프로젝트 구조
```
├── k8s
│   ├── api-gateway
│   │   ├── api-gateway-deployment.yml
│   │   ├── api-gateway-service.yml
│   ├── eureka-server
│   │   ├── eureka-server-deployment.yml
│   │   ├── eureka-server-service.yml
│   ├── ingress
│   │   └── msa-ingress.yml
│   ├── order-service
│   │   ├── order-service-deployment.yml
│   │   ├── order-service-service.yml
│   ├── payment-service
│   │   ├── payment-service-deployment.yml
│   │   ├── payment-service-service.yml
├── msa-api-gateway
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── hello.msa_api_gateway
│   │   │   │       └── MsaApiGatewayApplication.java
│   │   │   └── resources
│   │   │       ├── application.yml
│   ├── Dockerfile
│   ├── build.gradle
│   ├── settings.gradle
├── msa-eureka-server
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── hello.msa_eureka_server
│   │   │   │       └── MsaEurekaServerApplication.java
│   │   │   └── resources
│   │   │       └── application.yml
│   ├── Dockerfile
│   ├── build.gradle
│   ├── settings.gradle
├── msa-order-service
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── hello.msa_order_service
│   │   │   │       ├── MsaOrderServiceApplication.java
│   │   │   │       ├── OrderController.java
│   │   │   │       ├── OrderService.java
│   │   │   │       └── RabbitMQConfig.java
│   │   │   └── resources
│   │   │       ├── application.yml
│   ├── Dockerfile
│   ├── build.gradle
│   ├── settings.gradle
├── msa-payment-service
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── hello.msa_payment_service
│   │   │   │       ├── MsaPaymentServiceApplication.java
│   │   │   │       ├── PaymentController.java
│   │   │   │       ├── PaymentService.java
│   │   │   │       └── RabbitMQConfig.java
│   │   │   └── resources
│   │   │       ├── application.yml
│   ├── Dockerfile
│   ├── build.gradle
│   ├── settings.gradle
└── common
    ├── application-common.yml
    └── README.md
```