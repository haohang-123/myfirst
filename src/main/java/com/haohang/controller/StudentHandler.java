package com.haohang.controller;

import com.haohang.common.CommonResult;
import com.haohang.entity.Student;
import com.haohang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findAll")
    public CommonResult findAll() {
        List<Student> result = studentService.findAll();
        // 集合判空不要用size方法，建议使用isEmpty()方法
        if (!result.isEmpty()) {
            return new CommonResult(200, "查询成功", result);
        }
        return new CommonResult(444, "查询失败", Collections.emptyList());
    }

    @GetMapping("/findById/{id}")
    public CommonResult findById(@PathVariable("id") Integer id) {
        Student result = studentService.findById(id);
        if (result != null) {
            return new CommonResult(200, "查询成功", result);
        }
        return new CommonResult(444, "查询失败");
    }

    @PostMapping("/add")
    public CommonResult add(@RequestBody Student student) {
        int result = studentService.add(student);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        }
        return new CommonResult(444, "插入数据库失败");
    }

    @PutMapping("/update")
    public CommonResult update(@RequestBody Student student) {
        int result = studentService.update(student);
        if (result > 0) {
            return new CommonResult(200, "修改成功", result);
        }
        return new CommonResult(444, "修改数据失败");
    }

    @DeleteMapping("/delete/{id}")
    public CommonResult delete(@PathVariable("id") Integer id) {
        int result = studentService.delete(id);
        if (result > 0) {
            return new CommonResult(200, "删除成功", result);
        }
        return new CommonResult(444, "删除数据失败");
    }
}
