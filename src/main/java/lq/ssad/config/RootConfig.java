package lq.ssad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value="lq.ssad",excludeFilters={
        @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class})
}) //Spring的容器不扫描controller;父容器
public class RootConfig {


}
