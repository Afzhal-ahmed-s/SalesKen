package com.students.main.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.students.main.models.Student;

public interface StudentRepo extends ElasticsearchRepository<Student, String>{

}
