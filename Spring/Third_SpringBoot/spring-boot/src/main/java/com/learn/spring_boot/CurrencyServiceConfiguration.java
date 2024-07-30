package com.learn.spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    // Getter
    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }

    public String getUsername() {
        return username;
    }

    // Setter
    public void setUrl(String url) {
        this.url = url;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
