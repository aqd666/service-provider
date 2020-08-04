package cn.jiyun.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.jiyun.service.mapper")//mapper接口的包扫描
@EnableDiscoveryClient  //启用eureka客户端, @EnableEurekaClient也可以
public class ServiceProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceProviderApplication.class, args);

    }

}
