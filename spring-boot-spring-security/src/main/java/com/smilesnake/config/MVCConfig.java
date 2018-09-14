package com.smilesnake.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.smilesnake.domain.mapper")
@ComponentScan({ "com.smilesnake.domain.service", "com.smilesnake.controller" })
public class MVCConfig {

}
