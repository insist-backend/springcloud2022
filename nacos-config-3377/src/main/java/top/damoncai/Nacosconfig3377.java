package top.damoncai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/14 11:00
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Nacosconfig3377 {

    public static void main(String[] args) {
        SpringApplication.run(Nacosconfig3377.class, args);
    }
}
