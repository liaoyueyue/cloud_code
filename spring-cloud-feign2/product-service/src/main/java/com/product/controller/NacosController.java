package com.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-11-05
 * Time: 15:53
 */
@RestController
@RefreshScope
public class NacosController {
    @Value("${nacos.config}")
    private String nacosConfig;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return "从nacos获取配置项nacos.config：" + nacosConfig;
    }
}
