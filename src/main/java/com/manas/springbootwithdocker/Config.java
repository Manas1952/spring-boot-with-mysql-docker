package com.manas.springbootwithdocker;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.manas.springbootwithdocker")
@Configuration
public class Config {
}
