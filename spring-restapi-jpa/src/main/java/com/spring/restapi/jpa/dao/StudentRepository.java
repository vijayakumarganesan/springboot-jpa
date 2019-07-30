package com.spring.restapi.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.restapi.jpa.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
