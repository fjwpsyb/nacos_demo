package com.example.producer.controller;

import com.example.producer.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syb
 */
@RestController
@RequestMapping(value = "producer")
public class ProducerController {

    private UserConfig userConfig;

    @GetMapping("/getUsername")
    private String getUsername() {
        String result = userConfig.getUsername() + "-" + userConfig.getPassword();
        System.out.println(result);
        return result;
    }

    @Autowired
    public void setUserConfig(UserConfig userConfig) {
        this.userConfig = userConfig;
    }
}
