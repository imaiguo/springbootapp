


## 启动程序

```bash
> java -jar .\target\springbootapp-0.0.1.jar
```


## 接口访问 (spring-boot-starter-actuator) 企业管理
```bash
> curl http://localhost:8080/actuator/health
> curl http://localhost:8080/actuator
```

## JPA (hibernate) 持久化

SpringBoot依赖, Click Dependencies and select Spring Web, Spring Data JPA, and MySQL Drive

添加数据
```bash
> curl http://localhost:8000/hibernate/add -d name=First -d email=someemail@someemailprovider.com
> curl http://localhost:8000/hibernate/all
>
```

## MyBatis 持久化

SpringBoot依赖, Click Dependencies and select Spring Web, MyBatis, and MySQL Drive

