package com.haohang.repository;

import com.haohang.entity.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    void add(Student student);
}
