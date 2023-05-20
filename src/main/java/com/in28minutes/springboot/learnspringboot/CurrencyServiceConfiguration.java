package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * The currency service configuration class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 20 May 2023 - 18:17:07
 *
 */
@Data
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

}
