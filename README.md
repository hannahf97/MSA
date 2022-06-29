# MSA
## 0628

![image](https://user-images.githubusercontent.com/46432606/176067434-8cf39f80-f476-41de-9e54-0dcf37fe0ebc.png)
![image](https://user-images.githubusercontent.com/46432606/176067583-b0806001-2a28-4f64-9d16-ee1d6243fe12.png)

- 스프링에서는 Eureka를 통해 관리한다. NETFLIX가 만든 스프링의 기능 

### Eureka
AWS와 같은 Cloud 시스템에서 서비스의 로드 밸런싱과 실패처리 등을 유연하게 가져가 위해 각 서비스들의 IP / Port / InstanceId를 가지고 있는 REST 기반의 미들웨어 서버


## TDD 로 서비스 기반의 아키텍처의 핵심 원칙 
테스트 코드 작성하는 것이 오래걸린다. 

나중에 서버와 디비를 각자 하고싶은걸로 따로 개발이 가능하다. 


## 0629

### RandomPort 방법
1. PORT 번호를 0으로 한다
2. 실행시키면 0번이 자동적으로 PORT 번호가 할당된다 (할때마다 바뀜)

- terminal 에서 따로 port를 실행시키면 각자 다른 port번호가 나오지만 실제로 그 Eureka에는 보이지 않는다

그래서 `eureka.instance.instance-id : ${spring.cloud.clinet.hostname}:${spring.application.instance_id:${random.value}}`
를 사용해서 instance id를 다르게 표시함

### LoadBalancer 
여러서버가 분산 처리 해주는 것 

### API Gateway Service
- 중앙의 진입로, 모든 마이크로 서비스에 대해 경로를 처리해주는 서비스

### Netflix Ribbon
- 클라이언트 측 로드 밸런서
- 기존의 ip: port로 표기하는게 아니라 MSA Name으로 사용한다
- Spring Boot 2.4 Maintenance 상태 

### Netflix Zuul 
-Gateway 역할을 하는 것 
- 근데 이제 Maintenance 상태라 Spring Cloud Gateway로 알아보자

### Spring Cloud Gateway 
![image](https://user-images.githubusercontent.com/46432606/176425913-8067dcc8-de4f-4f92-adff-cebc9017f4a2.png)

* 주의 : url아님 uri 임
