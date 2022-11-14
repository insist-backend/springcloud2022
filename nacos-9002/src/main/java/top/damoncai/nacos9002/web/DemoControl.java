package top.damoncai.nacos9002.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/14 10:11
 */
@RestController
@RequestMapping("demo")
public class DemoControl {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/test")
    public String getServerPort(){
        return "Hello Nacos Discovery"+serverPort;
    }

    @GetMapping(value = "gatewayAccess")
    public String gatewayAccess(){
        return "gatewayAccess~~~"+serverPort;
    }
}
