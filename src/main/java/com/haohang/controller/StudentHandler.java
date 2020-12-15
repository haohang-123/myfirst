package com.haohang.controller;

import com.haohang.entity.Student;
import com.haohang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        return studentService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

    @PutMapping("update")
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }
}
