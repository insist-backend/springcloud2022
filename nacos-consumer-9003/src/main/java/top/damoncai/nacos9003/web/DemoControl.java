package top.damoncai.nacos9003.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;



    @GetMapping(value = "/test")
    public String getServerPort(){
        String res = restTemplate.getForObject("http://nacos-provider/demo/test", String.class);
        return res;
    }
}
