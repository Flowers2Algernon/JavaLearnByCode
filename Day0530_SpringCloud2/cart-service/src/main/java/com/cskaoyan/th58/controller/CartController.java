package com.cskaoyan.th58.controller;

import com.cskaoyan.th58.model.CartInfo;
import com.cskaoyan.th58.model.ProductInfo;
import com.cskaoyan.th58.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("cart")
public class CartController {


    @Autowired
    CartService cartService;

    @PostMapping("add/{skuId}")
    public CartInfo addCart(@PathVariable Long skuId, Integer num) {
        CartInfo cartInfo = new CartInfo();
        // 设置商品id
        cartInfo.setSkuId(skuId);
        // 设置添加商品的数量
        cartInfo.setNum(num);
        ProductInfo productInfo = cartService.findNameById(skuId);
        cartInfo.setSkuName(productInfo.getSkuName());
        cartInfo.setPrice(productInfo.getPrice());

        return cartInfo;

    }
}