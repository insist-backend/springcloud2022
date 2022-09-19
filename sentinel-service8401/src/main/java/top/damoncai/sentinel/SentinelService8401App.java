package top.damoncai.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//加此注解
public class SentinelService8401App {

    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401App.class, args);
    }

}