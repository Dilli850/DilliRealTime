package com.nt.service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;

public interface RTODetailsMgmt {
public String registerPerson(Person person);
public String registerDrivingDetails(DrivingLicense license);
}
