package com.orient.swaggerapi.repository;

import com.orient.swaggerapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepostory extends JpaRepository<Student, Long>{
}
