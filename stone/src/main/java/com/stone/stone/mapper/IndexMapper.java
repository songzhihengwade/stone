package com.stone.stone.mapper;

import com.stone.stone.po.Student;
import org.springframework.stereotype.Repository;

@Repository("indexMapper")
public interface IndexMapper {
    public Student getStudent();
}
