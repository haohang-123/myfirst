package com.haohang.repository;

import com.haohang.entity.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    int add(Student student);
    int update(Student student);
    Student findById(Integer id);
    int delete(Integer id);
}
