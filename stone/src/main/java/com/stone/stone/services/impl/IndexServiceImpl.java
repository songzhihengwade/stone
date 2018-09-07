package com.stone.stone.services.impl;

import com.stone.stone.mapper.IndexMapper;
import com.stone.stone.po.Student;
import com.stone.stone.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;
    @Override
    public Student getStudent() {

        return indexMapper.getStudent();
    }
}
