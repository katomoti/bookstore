package com.zsj.bookstore.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 配置中心
 * 1)、引入依赖，
 *      <dependency>
 *          <groupId>com.alibaba.cloud</groupId>
 *          <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *      </dependency>
 * 2）、创建—个bootstrap.properties
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3)、需要给配置中心默认添加一个叫数据集（DataId）guLimaLL-coupon.properties。默认规则，应用名·properties
 * 4)、给应用名·properties添加任何配置
 * 5)、动态获取配置。
 *      @RefreshScope ->动态获取并刷新配置
 *      @Value(${配置项的名称}) ->获取到配置
 *      优先使用配置中心的配置
 *
 * 细节
 *  1)命名空间：配置隔离
 *      默认：public；默认新增的所有配置都在public空间
 *      1、开发，测试，生产：利用命名空间来做环境隔离
 *          在bootstrap.properties里配置需要使用哪个命名空间下的配置
 *          spring.cloud.nacos.config.namespace=4408bc61-2d15-4c05-aadd-3962cc0b74f9
 *      2、每个微服务之间互相隔离配置，每个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *  2)Data ID ->配置ID
 *  3)配置分组：
 *      默认所有配置都属于：DEFAULT_GROUP
 *      每个微服务创建自己的命名空间，使用配置分组区分环境
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BookstoreCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreCouponApplication.class, args);
    }

}
