package com.jyotirmayadas.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.jyotirmayadas"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
