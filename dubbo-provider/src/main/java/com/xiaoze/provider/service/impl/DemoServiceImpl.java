package com.xiaoze.provider.service.impl;

import com.xiaoze.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * DemoServiceImpl
 * 服务提供类
 * @author xiaoze
 * @date 2018/6/7
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
