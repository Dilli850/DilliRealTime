package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Child;

public interface IChildRepo extends MongoRepository<Child, Integer> {

}
