package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.EmployeeMgmtService;
@Component
public class EmployeeRunner implements CommandLineRunner {
@Autowired
private EmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee employee=new Employee();
//		employee.setEid(1122);
//		employee.setEname("alki doneti");
//		System.out.println(service.saveEmployee(employee));
		service.showAllEmployee().forEach(System.out::println);
		

	}

}
