package com.nt.StudentRepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Student;

public interface IStudentRepo extends MongoRepository<Student, Integer> {
	public Student findBysid(Integer sid);

}
