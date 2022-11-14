package top.damoncai.provider9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 10:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider9003App {
    public static void main(String[] args) {
        SpringApplication.run(Provider9003App.class, args);
    }
}
