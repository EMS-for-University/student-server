package com.emsforuniversity.studentserver.repository;

import com.emsforuniversity.studentserver.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}