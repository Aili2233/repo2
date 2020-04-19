package com.bili.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bili.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aili
 * @create 2020-04-18 17:34
 */
@Service(interfaceClass = HelloService.class,protocol = "dubbo")
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
