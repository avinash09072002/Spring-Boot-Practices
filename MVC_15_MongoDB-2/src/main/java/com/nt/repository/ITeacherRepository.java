package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Teacher;

public interface ITeacherRepository extends MongoRepository<Teacher, String> {

}
