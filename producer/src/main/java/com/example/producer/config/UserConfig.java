package com.example.producer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author YuanBo.Shi
 * @date 2021年05月10日 2:38 下午
 */
@RefreshScope
@Component
public class UserConfig {
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}