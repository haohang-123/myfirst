package com.haohang.service.impl;

import com.haohang.entity.Student;
import com.haohang.repository.StudentRepository;
import com.haohang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public int add(Student student) {
        return studentRepository.add(student);
    }

    @Override
    public int update(Student student) {
        // 要处理的业务逻辑
        return studentRepository.update(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public int delete(int id) {
        return studentRepository.delete(id);
    }
}
