package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.Student;
import org.springframework.stereotype.Repository;

@Mapper
/*@Repository*/
public interface StuMapper extends BaseMapper<Student> {

}
