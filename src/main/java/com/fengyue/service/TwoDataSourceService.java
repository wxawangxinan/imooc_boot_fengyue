package com.fengyue.service;

import com.fengyue.mapper.StudentMapper;
import com.fengyue.pojo.Student;
import com.fengyue.pojo.Three;
import com.fengyue.pojo.Two;
import com.fengyue.threemapper.ThreeMapper;
import com.fengyue.twomapper.TwoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class TwoDataSourceService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TwoMapper twoMapper;
    @Autowired
    ThreeMapper threeMapper;


    public void insertTwoDataSource(){
        Student student = new Student();
        student.setId(UUID.randomUUID().toString().replace("-",""));
        student.setName("第一个数据库");
        studentMapper.insert(student);

        Two two = new Two();
        two.setId(UUID.randomUUID().toString().replace("-",""));
        two.setName("第二个数据库");
        twoMapper.insert(two);

        Three three = new Three();
        three.setId(UUID.randomUUID().toString().replace("-",""));
        three.setName("第三个数据库");
        threeMapper.insert(three);

        System.out.println("Yes");

    }


}
