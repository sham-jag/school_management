package com.example.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.entity.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {

}
