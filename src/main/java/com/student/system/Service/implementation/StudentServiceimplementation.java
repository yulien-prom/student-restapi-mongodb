package com.student.system.Service.implementation;

import com.student.system.Model.Student;
import com.student.system.Repository.StudentRepository;
import com.student.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimplementation implements StudentService {

    public Optional<Student> getStudentById;
    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public Optional<Student> getStudentById(String idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public String saveStudent(Student student) {
         studentRepository.save(student);
         return "Student was saved";
    }
}
