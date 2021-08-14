package com.example.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.entity.Student;

public interface studentDao extends JpaRepository<Student, Integer> {

}
