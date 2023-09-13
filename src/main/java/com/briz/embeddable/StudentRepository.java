package com.briz.embeddable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{
Student findByName(String name);
Student getById(int id);
Student findByAge(int age);

}
