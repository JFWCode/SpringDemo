package com.wk.spring.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.wk.spring")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
    @Value("{demo.port}")
    String port;

    @Value("{demo.version}")
    String version;

    @Override
    public String toString() {
        return "SpringConfig{" +
                "port='" + port + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
