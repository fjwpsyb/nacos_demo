package com.example.consumer.controller;

import com.example.consumer.rpc.IProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuanBo.Shi
 * @date 2021年05月10日 3:51 下午
 */
@RestController
@RequestMapping(value = "consumer")
public class TestNacosController {

    private IProducerFeign iProducerFeign;

    @GetMapping("/testNacos")
    private String testNacos() {
        return iProducerFeign.getUsername();
    }

    @Autowired
    public void setiProducerFeign(IProducerFeign iProducerFeign) {
        this.iProducerFeign = iProducerFeign;
    }
}