package com.zsj.bookstore.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 */
@EnableFeignClients(basePackages = "com.zsj.bookstore.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class BookstoreMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreMemberApplication.class, args);
    }

}
