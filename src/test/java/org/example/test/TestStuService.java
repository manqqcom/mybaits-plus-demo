package org.example.test;

import org.example.pojo.Student;
import org.example.service.StuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestStuService {

    @Autowired
    private StuService stuService;

    @Test
    public void testStuService(){
        int count = stuService.count();
        System.out.println(count);
    }
}
