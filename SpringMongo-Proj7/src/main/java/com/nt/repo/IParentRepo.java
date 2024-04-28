package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Parent;

public interface IParentRepo extends MongoRepository<Parent, Integer> {

}
