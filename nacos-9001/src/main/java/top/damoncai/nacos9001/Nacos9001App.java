package top.damoncai.nacos9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/14 10:10
 */
@SpringBootApplication
@EnableDiscoveryClient//加此注解
public class Nacos9001App {

    public static void main(String[] args) {
        SpringApplication.run(Nacos9001App.class, args);
    }

}
