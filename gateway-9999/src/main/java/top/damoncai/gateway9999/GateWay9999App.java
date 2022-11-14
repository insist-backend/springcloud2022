package top.damoncai.gateway9999;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 14:06
 */
@SpringBootApplication
@EnableDiscoveryClient//加此注解
public class GateWay9999App {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9999App.class, args);
    }
}
