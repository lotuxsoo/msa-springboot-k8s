## 프로젝트 구조
```
.
├── application-common.yml        # 모든 서비스가 참조하는 공통 설정 파일
├── README.md
├── k8s                           # Kubernetes 관련 파일
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
│       │       └── application.yml  # 공통 설정 파일 참조
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
│           └── application.yml  # 공통 설정 파일 참조
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
│           └── application.yml  # 공통 설정 파일 참조
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
│           └── application.yml  # 공통 설정 파일 참조
```