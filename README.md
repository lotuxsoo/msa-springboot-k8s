## 프로젝트 구조
```
.
├── k8s
│   ├── api-gateway
│   │   ├── api-gateway-deployment.yml
│   │   └── api-gateway-service.yml
│   ├── eureka-server
│   │   ├── eureka-server-deployment.yml
│   │   └── eureka-server-service.yml
│   ├── ingress
│   │   └── msa-ingress.yml
│   ├── order-service
│   │   ├── order-service-deployment.yml
│   │   └── order-service.yml
│   └── payment-service
│       ├── payment-service-deployment.yml
│       └── payment-service.yml
├── msa-api-gateway
│   ├── Dockerfile
│   ├── HELP.md
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       ├── main
│   │   │       │   └── hello
│   │   │       │       └── msa_api_gateway
│   │   │       │           └── MsaApiGatewayApplication.class
│   │   │       └── test
│   │   │           └── hello
│   │   │               └── msa_api_gateway
│   │   │                   └── MsaApiGatewayApplicationTests.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       ├── main
│   │   │       │       └── test
│   │   │       └── headers
│   │   │           └── java
│   │   │               ├── main
│   │   │               └── test
│   │   ├── libs
│   │   │   ├── msa-api-gateway-0.0.1-SNAPSHOT-plain.jar
│   │   │   └── msa-api-gateway-0.0.1-SNAPSHOT.jar
│   │   ├── reports
│   │   │   └── tests
│   │   │       └── test
│   │   │           ├── classes
│   │   │           │   └── hello.msa_api_gateway.MsaApiGatewayApplicationTests.html
│   │   │           ├── css
│   │   │           │   ├── base-style.css
│   │   │           │   └── style.css
│   │   │           ├── index.html
│   │   │           ├── js
│   │   │           │   └── report.js
│   │   │           └── packages
│   │   │               └── hello.msa_api_gateway.html
│   │   ├── resolvedMainClassName
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── api-gateway-deployment.yml
│   │   │       ├── api-gateway-service.yml
│   │   │       └── application.yml
│   │   ├── test-results
│   │   │   └── test
│   │   │       ├── TEST-hello.msa_api_gateway.MsaApiGatewayApplicationTests.xml
│   │   │       └── binary
│   │   │           ├── output.bin
│   │   │           ├── output.bin.idx
│   │   │           └── results.bin
│   │   └── tmp
│   │       ├── bootJar
│   │       │   └── MANIFEST.MF
│   │       ├── compileJava
│   │       │   ├── compileTransaction
│   │       │   │   ├── backup-dir
│   │       │   │   └── stash-dir
│   │       │   └── previous-compilation-data.bin
│   │       ├── compileTestJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── jar
│   │       │   └── MANIFEST.MF
│   │       └── test
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_api_gateway
│       │   │           └── MsaApiGatewayApplication.java
│       │   └── resources
│       │       └── application.yml
│       └── test
│           └── java
│               └── hello
│                   └── msa_api_gateway
│                       └── MsaApiGatewayApplicationTests.java
├── msa-eureka-server
│   ├── Dockerfile
│   ├── HELP.md
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       ├── main
│   │   │       │   └── hello
│   │   │       │       └── msa_eureka_server
│   │   │       │           └── MsaEurekaServerApplication.class
│   │   │       └── test
│   │   │           └── hello
│   │   │               └── msa_eureka_server
│   │   │                   └── MsaEurekaServerApplicationTests.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       ├── main
│   │   │       │       └── test
│   │   │       └── headers
│   │   │           └── java
│   │   │               ├── main
│   │   │               └── test
│   │   ├── libs
│   │   │   ├── msa-eureka-server-0.0.1-SNAPSHOT-plain.jar
│   │   │   └── msa-eureka-server-0.0.1-SNAPSHOT.jar
│   │   ├── reports
│   │   │   └── tests
│   │   │       └── test
│   │   │           ├── classes
│   │   │           │   └── hello.msa_eureka_server.MsaEurekaServerApplicationTests.html
│   │   │           ├── css
│   │   │           │   ├── base-style.css
│   │   │           │   └── style.css
│   │   │           ├── index.html
│   │   │           ├── js
│   │   │           │   └── report.js
│   │   │           └── packages
│   │   │               └── hello.msa_eureka_server.html
│   │   ├── resolvedMainClassName
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── application.yml
│   │   │       ├── static
│   │   │       └── templates
│   │   ├── test-results
│   │   │   └── test
│   │   │       ├── TEST-hello.msa_eureka_server.MsaEurekaServerApplicationTests.xml
│   │   │       └── binary
│   │   │           ├── output.bin
│   │   │           ├── output.bin.idx
│   │   │           └── results.bin
│   │   └── tmp
│   │       ├── bootJar
│   │       │   └── MANIFEST.MF
│   │       ├── compileJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── compileTestJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── jar
│   │       │   └── MANIFEST.MF
│   │       └── test
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_eureka_server
│       │   │           └── MsaEurekaServerApplication.java
│       │   └── resources
│       │       ├── application.yml
│       │       ├── static
│       │       └── templates
│       └── test
│           └── java
│               └── hello
│                   └── msa_eureka_server
│                       └── MsaEurekaServerApplicationTests.java
├── msa-order-service
│   ├── Dockerfile
│   ├── HELP.md
│   ├── bin
│   │   ├── generated-sources
│   │   │   └── annotations
│   │   └── generated-test-sources
│   │       └── annotations
│   ├── build
│   │   ├── classes
│   │   │   └── java
│   │   │       ├── main
│   │   │       │   └── hello
│   │   │       │       └── msa_demo_2
│   │   │       │           ├── MsaDemo2Application.class
│   │   │       │           ├── OrderController.class
│   │   │       │           ├── OrderRequest.class
│   │   │       │           ├── OrderService.class
│   │   │       │           └── RabbitMQConfig.class
│   │   │       └── test
│   │   │           └── hello
│   │   │               └── msa_demo_2
│   │   │                   └── MsaDemo2ApplicationTests.class
│   │   ├── generated
│   │   │   └── sources
│   │   │       ├── annotationProcessor
│   │   │       │   └── java
│   │   │       │       ├── main
│   │   │       │       └── test
│   │   │       └── headers
│   │   │           └── java
│   │   │               ├── main
│   │   │               └── test
│   │   ├── libs
│   │   │   ├── msa-demo-2-0.0.1-SNAPSHOT-plain.jar
│   │   │   └── msa-demo-2-0.0.1-SNAPSHOT.jar
│   │   ├── reports
│   │   │   └── tests
│   │   │       └── test
│   │   │           ├── classes
│   │   │           │   └── hello.msa_demo_2.MsaDemo2ApplicationTests.html
│   │   │           ├── css
│   │   │           │   ├── base-style.css
│   │   │           │   └── style.css
│   │   │           ├── index.html
│   │   │           ├── js
│   │   │           │   └── report.js
│   │   │           └── packages
│   │   │               └── hello.msa_demo_2.html
│   │   ├── resolvedMainClassName
│   │   ├── resources
│   │   │   └── main
│   │   │       ├── application.yml
│   │   │       ├── static
│   │   │       └── templates
│   │   ├── test-results
│   │   │   └── test
│   │   │       ├── TEST-hello.msa_demo_2.MsaDemo2ApplicationTests.xml
│   │   │       └── binary
│   │   │           ├── output.bin
│   │   │           ├── output.bin.idx
│   │   │           └── results.bin
│   │   └── tmp
│   │       ├── bootJar
│   │       │   └── MANIFEST.MF
│   │       ├── compileJava
│   │       │   ├── compileTransaction
│   │       │   │   ├── backup-dir
│   │       │   │   └── stash-dir
│   │       │   │       └── OrderController.class.uniqueId0
│   │       │   └── previous-compilation-data.bin
│   │       ├── compileTestJava
│   │       │   └── previous-compilation-data.bin
│   │       ├── jar
│   │       │   └── MANIFEST.MF
│   │       └── test
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── hello
│       │   │       └── msa_demo_2
│       │   │           ├── MsaDemo2Application.java
│       │   │           ├── OrderController.java
│       │   │           ├── OrderRequest.java
│       │   │           ├── OrderService.java
│       │   │           └── RabbitMQConfig.java
│       │   └── resources
│       │       ├── application.yml
│       │       ├── static
│       │       └── templates
│       └── test
│           └── java
│               └── hello
│                   └── msa_demo_2
│                       └── MsaDemo2ApplicationTests.java
└── msa-payment-service
    ├── Dockerfile
    ├── HELP.md
    ├── bin
    │   ├── generated-sources
    │   │   └── annotations
    │   └── generated-test-sources
    │       └── annotations
    ├── build
    │   ├── classes
    │   │   └── java
    │   │       ├── main
    │   │       │   └── hello
    │   │       │       └── msa_demo_1
    │   │       │           ├── MsaDemo1Application.class
    │   │       │           ├── OrderRequest.class
    │   │       │           ├── PaymentController.class
    │   │       │           ├── PaymentRequest.class
    │   │       │           ├── PaymentService.class
    │   │       │           └── RabbitMQConfig.class
    │   │       └── test
    │   │           └── hello
    │   │               └── msa_demo_1
    │   │                   └── MsaDemo1ApplicationTests.class
    │   ├── generated
    │   │   └── sources
    │   │       ├── annotationProcessor
    │   │       │   └── java
    │   │       │       ├── main
    │   │       │       └── test
    │   │       └── headers
    │   │           └── java
    │   │               ├── main
    │   │               └── test
    │   ├── libs
    │   │   ├── msa-demo-1-0.0.1-SNAPSHOT-plain.jar
    │   │   └── msa-demo-1-0.0.1-SNAPSHOT.jar
    │   ├── reports
    │   │   └── tests
    │   │       └── test
    │   │           ├── classes
    │   │           │   └── hello.msa_demo_1.MsaDemo1ApplicationTests.html
    │   │           ├── css
    │   │           │   ├── base-style.css
    │   │           │   └── style.css
    │   │           ├── index.html
    │   │           ├── js
    │   │           │   └── report.js
    │   │           └── packages
    │   │               └── hello.msa_demo_1.html
    │   ├── resolvedMainClassName
    │   ├── resources
    │   │   └── main
    │   │       ├── application.yml
    │   │       ├── static
    │   │       └── templates
    │   ├── test-results
    │   │   └── test
    │   │       ├── TEST-hello.msa_demo_1.MsaDemo1ApplicationTests.xml
    │   │       └── binary
    │   │           ├── output.bin
    │   │           ├── output.bin.idx
    │   │           └── results.bin
    │   └── tmp
    │       ├── bootJar
    │       │   └── MANIFEST.MF
    │       ├── compileJava
    │       │   ├── compileTransaction
    │       │   │   ├── backup-dir
    │       │   │   └── stash-dir
    │       │   │       └── PaymentController.class.uniqueId0
    │       │   └── previous-compilation-data.bin
    │       ├── compileTestJava
    │       │   └── previous-compilation-data.bin
    │       ├── jar
    │       │   └── MANIFEST.MF
    │       └── test
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle
    └── src
        ├── main
        │   ├── java
        │   │   └── hello
        │   │       └── msa_demo_1
        │   │           ├── MsaDemo1Application.java
        │   │           ├── OrderRequest.java
        │   │           ├── PaymentController.java
        │   │           ├── PaymentRequest.java
        │   │           ├── PaymentService.java
        │   │           └── RabbitMQConfig.java
        │   └── resources
        │       ├── application.yml
        │       ├── static
        │       └── templates
        └── test
            └── java
                └── hello
                    └── msa_demo_1
                        └── MsaDemo1ApplicationTests.java
```