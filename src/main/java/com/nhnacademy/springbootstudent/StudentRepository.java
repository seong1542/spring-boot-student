package com.nhnacademy.springbootstudent;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> { //인터페이스가 인터페이스를 상속받으니 extends임.
}
