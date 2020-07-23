package com.czl.supermarket.order;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.czl.supermarket.order.entity.OrderItemEntity;
import com.czl.supermarket.order.service.OrderItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketOrderApplicationTests {

    @Autowired
    private OrderItemService orderItemService;

    @Test
   public
    void contextLoads() {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setCategoryId(123L);
        orderItemService.save(orderItemEntity);

        List<OrderItemEntity> list = orderItemService.list(new QueryWrapper<OrderItemEntity>().eq("category_id", "123L"));
        System.out.println("list = " + list);


    }

}
