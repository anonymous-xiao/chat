package com.sean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis mapper 包路径
@MapperScan(basePackages = "com.sean.mapper")
//扫描所有需要的包，包含一些工具类包所在的路径
@ComponentScan(basePackages = {"com.sean","org.n3r.idworker"})
//@EnableScheduling //开启定时任务
//@EnableAsync //开启异步调用
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
