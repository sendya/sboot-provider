package io.tooko.sboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import io.tooko.sboot.service.EchoService;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String str) {
        System.out.println(str);
        return str;
    }

}
