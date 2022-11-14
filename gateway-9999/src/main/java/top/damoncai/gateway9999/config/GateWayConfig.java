package top.damoncai.gateway9999.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author zhishun.cai
 * @since 2022/9/20 14:26
 */
//@Configuration
public class GateWayConfig {
    /*
    配置了一个id为path_msb1的路由规则
    当访问地址http://localhost:9999/msb/**
    就会转发到http://localhost:9001/nacos-provider/msb/任何地址
     */

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        // 构建多个路由routes
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 具体路由地址
        routes.route("path_damocnai",r -> r.path("/damoncai/**").uri("http://localhost:9001/nacos-provider")).build();
        // 返回所有路由规则
        return routes.build();
    }
}
