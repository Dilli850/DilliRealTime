package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IemployeeRepo;

@Service("emp")
public class EmployeeService implements EmployeeMgmtService {
@Autowired
private IemployeeRepo iemployeeRepo;
	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return "employee saved with this id"+iemployeeRepo.insert(employee).getEid();
	}
	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return iemployeeRepo.findAll();
	}

}
