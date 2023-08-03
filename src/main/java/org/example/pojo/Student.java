package org.example.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @TableId
    private Integer id;
    private String name;
    private String gender;
/*
    private Integer is_delete;*/
}
