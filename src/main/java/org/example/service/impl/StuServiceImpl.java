package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.StuMapper;
import org.example.pojo.Student;
import org.example.service.StuService;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements StuService {


}
