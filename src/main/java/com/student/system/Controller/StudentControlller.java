package com.student.system.Controller;


import com.student.system.Model.Student;
import com.student.system.Service.implementation.StudentServiceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentControlller {

    @Autowired
    StudentServiceimplementation studentServiceimplementation;

    @GetMapping
    public List<Student> getALLStudent(){
        return studentServiceimplementation.getAllStudents();
    }

    @GetMapping("/{idStudent}")
    public Optional<Student> getStudentById(@PathVariable String idStudent){
       return studentServiceimplementation.getStudentById(idStudent);
    }
    @PostMapping String saveStudent(@RequestBody Student student){
   return studentServiceimplementation.saveStudent(student);
    }
}