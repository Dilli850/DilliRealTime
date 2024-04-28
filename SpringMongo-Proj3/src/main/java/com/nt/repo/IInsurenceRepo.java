package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Insurence;

public interface IInsurenceRepo extends MongoRepository<Insurence, Integer> {
public Insurence findbyidInsurence(Integer id);
}
