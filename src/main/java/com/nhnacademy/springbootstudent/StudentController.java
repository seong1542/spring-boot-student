package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.actuator.CouterEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    private final CouterEndpoint endpoint;

    @GetMapping("/students")
    public List<Student> getStudents(){
        endpoint.increment(1L);
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Long id){
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "{\"result\":\"OK\"}";
    }
}
