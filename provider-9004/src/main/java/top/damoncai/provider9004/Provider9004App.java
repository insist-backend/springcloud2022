package top.damoncai.provider9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 10:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider9004App {
    public static void main(String[] args) {
        SpringApplication.run(Provider9004App.class, args);
    }

}
