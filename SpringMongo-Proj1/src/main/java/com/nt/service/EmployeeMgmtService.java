package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface EmployeeMgmtService {
public String saveEmployee(Employee employee);
public List<Employee> showAllEmployee();
}
