package org.example.test;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mapper.StuMapper;
import org.example.pojo.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
/*@MapperScan("org.example.mapper.StuMapper")*/
/*@ContextConfiguration(classes = StuMapper.class)
@SpringBootConfiguration*/
public class TestStuMapper {
    @Autowired/*(required = true)*/
    private StuMapper stuMapper;
    @Test
    public void testStuMapper(){
        //查询
/*        List<Student> list1 = stuMapper.selectList(null);
        list1.forEach(s-> System.out.println(s));*/

        //排序    查询
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("id");
        List<Student> list2 = stuMapper.selectList(wrapper);
        list2.forEach(System.out::println);
    }

    @Test
    public void test01(){
        UpdateWrapper<Student> updateWrapper=new UpdateWrapper<>();
        updateWrapper.like("name","三").eq("gender","男");
        updateWrapper.set("name","小三").set("gender","女");
        int update = stuMapper.update(null,updateWrapper);
        System.out.println(update);
    }

    @Test
    public void test02(){
        Page<Student> page = new Page<>();
        stuMapper.selectPage(page,null);
        System.out.println(page);
    }
}