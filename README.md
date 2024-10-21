## 프로젝트 구조
```
.
├── 📄 application-common.yml         # 모든 서비스가 참조하는 공통 설정 파일 (RabbitMQ, Eureka 등)
├── 📂 k8s                            # Kubernetes 관련 리소스
│   ├── 📂 api-gateway
│   │   ├── 📄 api-gateway-deployment.yml
│   │   └── 📄 api-gateway-service.yml
│   ├── 📂 eureka-server
│   │   ├── 📄 eureka-server-deployment.yml
│   │   └── 📄 eureka-server-service.yml
│   ├── 📂 order-service
│   │   ├── 📄 order-service-deployment.yml
│   │   └── 📄 order-service-service.yml
│   ├── 📂 payment-service
│   │   ├── 📄 payment-service-deployment.yml
│   │   └── 📄 payment-service-service.yml
│   └── 📂 ingress
│       └── 📄 msa-ingress.yml        # 외부 트래픽을 API Gateway로 라우팅하는 Ingress 설정
├── 📂 services                       # 모든 마이크로서비스의 소스 코드
│   ├── 🚀 msa-api-gateway            # API Gateway 마이크로서비스
│   │   ├── 📄 Dockerfile
│   │   ├── 📄 build.gradle
│   │   └── 📂 src
│   │       └── 📂 resources
│   │           └── 📄 application.yml
│   ├── 🚀 msa-eureka-server          # Eureka Server 마이크로서비스
│   │   ├── 📄 Dockerfile
│   │   ├── 📄 build.gradle
│   │   └── 📂 src
│   │       └── 📂 resources
│   │           └── 📄 application.yml
│   ├── 🚀 msa-order-service          # Order Service 마이크로서비스
│   │   ├── 📄 Dockerfile
│   │   ├── 📄 build.gradle
│   │   └── 📂 src
│   │       └── 📂 resources
│   │           └── 📄 application.yml
│   └── 🚀 msa-payment-service        # Payment Service 마이크로서비스
│       ├── 📄 Dockerfile
│       ├── 📄 build.gradle
│       └── 📂 src
│           └── 📂 resources
│               └── 📄 application.yml

```