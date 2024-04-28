package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Insurence;
import com.nt.service.IInsurenceMgmt;
@Component
public class InsurenceRunner implements CommandLineRunner {
@Autowired
private IInsurenceMgmt mgmt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Insurence insurence=new Insurence();
//		insurence.setInsurenceid(123485);
//		insurence.setInsurencename("loan");
//		insurence.setInsurencebrand(12666.5432);
//		System.out.println(mgmt.saveDetails(insurence));
//		System.out.println(mgmt.detailsbyname("health"));
		System.out.println(mgmt.detailsbyid(1234));

	}

}
