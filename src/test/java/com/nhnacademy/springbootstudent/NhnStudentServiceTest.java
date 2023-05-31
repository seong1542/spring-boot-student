package com.nhnacademy.springbootstudent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class NhnStudentServiceTest {

//    @Autowired
//    StudentService studentService;
//    @Test
//    void testGetStudents() {
//        List<Student> students = studentService.getStudents();
//        System.out.println(students);
//        assertEquals(2, students.size());
//    }
//

    @Autowired
    StudentRepository studentRepository;
    @Test
    void testStudentRepository(){
       Student kim = new Student(1L, "kimjumi", 200);
       studentRepository.save(kim);
       Optional<Student> student = studentRepository.findById(1L);
       assertThat(student).isPresent();
       assertThat(student.get()).isEqualTo(kim);
    }
}