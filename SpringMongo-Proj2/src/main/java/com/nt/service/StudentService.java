package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.StudentRepo.IStudentRepo;
import com.nt.document.Student;
@Service
public class StudentService implements IStudentMgmtSevice {
@Autowired
private IStudentRepo iStudentRepo;
	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		return "student saved with this id"+iStudentRepo.insert(student).getSid();
	}
	@Override
	public Student serachByStudentid(Integer sid) {
		// TODO Auto-generated method stub
		return iStudentRepo.findBysid(sid);
	}
	

}
