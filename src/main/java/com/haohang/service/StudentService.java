package com.haohang.service;

import com.haohang.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void add(Student student);
    void update(Student student);
}
