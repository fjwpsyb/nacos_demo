package com.example.consumer.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "producer")
@Component
public interface IProducerFeign {
    /**
     * 获取生产者名称接口
     *
     * @return
     */
    @GetMapping("/producer/getUsername")
    String getUsername();

}