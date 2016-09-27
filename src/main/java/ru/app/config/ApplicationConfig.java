package ru.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by nioshi on 12.02.16.
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class ApplicationConfig {
    /**
     * Necessary to make the @Value annotations work.
     *
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
