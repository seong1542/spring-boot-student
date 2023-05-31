package com.nhnacademy.springbootstudent;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
@Transactional
public class NhnStudentService implements StudentService {
    private final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        if(studentRepository.existsById(student.getId())){
            throw new RuntimeException("존재하는 학생입니다.");
        }
        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)){
            throw new RuntimeException("존재하지 않는 학생입니다.");
        }
        studentRepository.deleteById(id);
    }
}
