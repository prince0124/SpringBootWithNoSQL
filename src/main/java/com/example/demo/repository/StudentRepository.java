package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
  public List<Student> numberLessThan(int number);
  
  @Query(value="{name:?0}")
  public List<Student> findByName(String city);
}
