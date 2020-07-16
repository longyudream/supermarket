package com.czl.supermarket.product;

import com.czl.common.utils.PageUtils;
import com.czl.supermarket.product.entity.BrandEntity;
import com.czl.supermarket.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("小米手机,天下无敌");
        brandEntity.setName("小米");
        brandEntity.setBrandId(100L);
        boolean save = brandService.save(brandEntity);
        System.out.println("新增数返回结果 = " + save);
        PageUtils pageUtils = brandService.queryPage(new HashMap<>());
        System.out.println("pageUtils = " + pageUtils);
    }

}
