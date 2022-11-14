package top.damoncai.consumer8084;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 10:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer8084App {

    public static void main(String[] args) {
            SpringApplication.run(Consumer8084App.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
