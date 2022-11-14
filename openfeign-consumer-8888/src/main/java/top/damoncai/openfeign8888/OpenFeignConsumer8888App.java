package top.damoncai.openfeign8888;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 11:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//添加此注解
public class OpenFeignConsumer8888App {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumer8888App.class, args);
    }
}
