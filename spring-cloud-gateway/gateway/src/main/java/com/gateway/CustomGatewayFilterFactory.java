package com.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-12
 * Time: 16:14
 */
@Slf4j
@Component
public class CustomGatewayFilterFactory extends AbstractGatewayFilterFactory<CustomConfig> implements Ordered {
    public CustomGatewayFilterFactory() {
        super(CustomConfig.class);
    }

    @Override
    public GatewayFilter apply(CustomConfig config) {
        return new GatewayFilter() {
            /**
             *
             * @param exchange HTTP 请求响应交互契约，提供了对HTTP请求和响应的访问
             * @param chain 过滤器链
             * Mono: Reactor 的核心类 数据流发布者，Mono 最多只能触发一个事件。可以把 Mono 用在异步完成任务时，发出通知
             */
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                // Pre类型 执行请求  Post类型
                log.info("Pre Filter, config:{}", config);
                return chain.filter(exchange);
            }
        };
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
