# MSA 기반 Kubernetes 배포 프로젝트

## 개요
이 프로젝트는 주문(Order) 서비스와 결제(Payment) 서비스를 마이크로서비스 아키텍처(MSA)로 구현하고, Kubernetes를 이용하여 배포 및 운영하는 실습을 목적으로 합니다.

## 목차
1. [프로젝트 소개](#프로젝트-소개)
2. [서비스 설명](#서비스-설명)
3. [구현 기술](#구현-기술)
4. [구성 및 폴더 구조](#구성-및-폴더-구조)
5. [실습 단계](#실습-단계)

## 프로젝트 소개
이 프로젝트는 금융 IT 환경에서의 MSA 도입을 돕기 위해 설계되었습니다. Spring Boot 기반의 주문 및 결제 서비스를 구성하고, 이를 Kubernetes 환경에서 배포하여 클라우드 네이티브 기술을 직접 체험할 수 있습니다.

## 서비스 설명
- **Order Service**: 고객의 주문을 처리하고 관련 정보를 관리하는 서비스
- **Payment Service**: 결제 요청을 처리하고 결제 상태를 관리하는 서비스
- **API Gateway**: 외부 클라이언트로부터의 요청을 각 서비스로 라우팅
- **Eureka Server**: 각 서비스의 레지스트리 역할을 수행하여 동적 서비스 검색 지원

## 구현 기술
- **Spring Boot**: 마이크로서비스 구축
- **Eureka**: 서비스 레지스트리 및 동적 서비스 검색
- **API Gateway**: 라우팅 및 트래픽 관리
- **Docker**: 서비스 컨테이너화
- **Kubernetes**: 서비스 배포 및 관리
- **Ingress**: 외부 트래픽을 API Gateway로 전달

## 구성 및 폴더 구조
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

## 실습 단계
1. **서비스 구현**: 주문 및 결제 서비스 소스 코드를 확인하고, Spring Boot로 구현된 서비스를 학습합니다.
2. **컨테이너화**: 각 서비스의 Docker 이미지를 빌드하고 Docker Hub에 푸시합니다.
3. **Kubernetes 배포**: Kubernetes 설정 파일을 사용하여 클러스터에 서비스를 배포합니다.
4. **Ingress 설정**: 외부 트래픽을 관리하기 위한 Ingress를 설정하고 API Gateway로 연결합니다.
5. **서비스 간 통신 테스트**: API Gateway를 통해 주문 및 결제 서비스의 통신을 테스트합니다.
