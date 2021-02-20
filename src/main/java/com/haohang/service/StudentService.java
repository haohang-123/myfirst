package com.haohang.service;

import com.haohang.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    int add(Student student);
    int update(Student student);
    Student findById(int id);
    int delete(int id);
}
