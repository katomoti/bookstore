package com.zsj.bookstore.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 逻辑删除---非直接删除数据，而是设置一个标志位，表示其被删除
 * 1、配置全局的逻辑删除规则
 * 2、配置逻辑删除的组件Bean（高版本无须此步骤）
 * 3、给Bean加上逻辑删除注解@TableLogic
 */
@EnableDiscoveryClient
@MapperScan("com.zsj.bookstore.product.dao")
@SpringBootApplication
public class BookstoreProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreProductApplication.class, args);
    }

}
