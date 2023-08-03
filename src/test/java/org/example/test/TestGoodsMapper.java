package org.example.test;

import org.example.mapper.GoodsMapper;
import org.example.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGoodsMapper {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void test(){
        //小李  查询商品价格
        Goods goodsl = goodsMapper.selectById(1);
        System.out.println("小李 查询到的商品价格："+goodsl.getPrice());

        //小王  查询商品价格
        Goods goodsw = goodsMapper.selectById(1);
        System.out.println("小王 查询到的商品价格："+goodsw.getPrice());

        //小李 修改商品价格
        goodsl.setPrice(goodsl.getPrice()+50);
        goodsMapper.updateById(goodsl);

        //小王 修改商品价格
        goodsw.setPrice(goodsw.getPrice()-30);
        goodsMapper.updateById(goodsw);

        //老板 查询商品价格
        Goods goodsb = goodsMapper.selectById(1);
        System.out.println("老板 查询到的商品价格："+goodsb.getPrice());
    }
}
