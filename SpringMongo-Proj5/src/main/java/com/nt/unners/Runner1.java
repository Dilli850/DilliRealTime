package com.nt.unners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.RTODetailsMgmt;
@Component
public class Runner1 implements CommandLineRunner {
@Autowired
private RTODetailsMgmt detailsMgmt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setPid(1122);
		person.setPname("alki");
		
		person.setPaddrs("hyd");
		DrivingLicense license=new DrivingLicense();
		license.setLicenseNo(112345l);
		license.setType("2 wheler");
		license.setExpiryTime(LocalDate.now());
		
		person.setDrivingLicense(license);
		System.out.println(detailsMgmt.registerPerson(person));
		

	}

}
