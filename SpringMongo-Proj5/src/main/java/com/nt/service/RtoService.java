package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.repo.IDrivingLicenseRepo;
import com.nt.repo.IPersonRepo;

@Service("rtoService")
public class RtoService implements RTODetailsMgmt {

    @Autowired
    private IPersonRepo iPersonRepo;

    @Autowired
    private IDrivingLicenseRepo drivingLicenseRepo;

    @Override
    public String registerPerson(Person person) {
        Person savedPerson = iPersonRepo.save(person);
        return "Person details registered with ID: " + savedPerson.getPid();
    }

    @Override
    public String registerDrivingDetails(DrivingLicense license) {
        DrivingLicense savedLicense = drivingLicenseRepo.save(license);
        return "Driving license registered with ID: " + savedLicense.getLicenseNo();
    }
}
