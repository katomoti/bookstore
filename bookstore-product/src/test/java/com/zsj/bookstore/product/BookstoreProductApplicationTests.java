package com.zsj.bookstore.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zsj.bookstore.product.entity.BrandEntity;
import com.zsj.bookstore.product.service.BrandService;
import com.zsj.bookstore.product.service.impl.BrandServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookstoreProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("完成");
    }

}
