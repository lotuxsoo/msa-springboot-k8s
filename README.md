## 프로젝트 구조
```
.
├── k8s                       # Kubernetes 관련 파일
│   ├── ingress
│   │   └── msa-ingress.yml    # Ingress 정의
│   ├── order-service
│   │   ├── order-service-deployment.yml   # Order Service의 Deployment 정의
│   │   └── order-service-service.yml      # Order Service의 Service 정의
│   ├── payment-service
│   │   ├── payment-service-deployment.yml # Payment Service의 Deployment 정의
│   │   └── payment-service-service.yml    # Payment Service의 Service 정의
├── msa-order-service          # Order Service 코드와 설정
│   ├── Dockerfile
│   ├── build.gradle
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── hello
│   │       │       └── order_service
│   │       └── resources
│   │           └── application.yml
├── msa-payment-service        # Payment Service 코드와 설정
│   ├── Dockerfile
│   ├── build.gradle
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── hello
│   │       │       └── payment_service
│   │       └── resources
│   │           └── application.yml
├── README.md
└── application-common.yml     # 공통 설정 파일 (RabbitMQ, Eureka 등)
```