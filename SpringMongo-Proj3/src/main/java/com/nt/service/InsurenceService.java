package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Insurence;
import com.nt.repo.IInsurenceRepo;
@Service("ser")
public class InsurenceService implements IInsurenceMgmt {
@Autowired
private IInsurenceRepo repo;
	@Override
	public String saveDetails(Insurence insurence) {
		// TODO Auto-generated method stub
		return "insurence is save with this id"+repo.insert(insurence).getInsurenceid();
	}
	@Override
	public Insurence detailsbyid(Integer id) {
		// TODO Auto-generated method stub
		return repo.findbyidInsurence(id);
	}
	

}
