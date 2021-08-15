package com.example.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.entity.Class;

public interface ClassDao extends JpaRepository<Class, Integer> {

}
