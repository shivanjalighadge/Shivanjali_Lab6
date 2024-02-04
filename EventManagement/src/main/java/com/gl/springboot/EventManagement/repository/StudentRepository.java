package com.gl.springboot.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.springboot.EventManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}