package com.distribuidas.practicaws_rest.repository;

import com.distribuidas.practicaws_rest.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
