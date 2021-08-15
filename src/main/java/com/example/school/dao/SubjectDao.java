package com.example.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.entity.Subject;

public interface SubjectDao extends JpaRepository<Subject, Integer> {

}
