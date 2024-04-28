package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Student;
import com.nt.service.IStudentMgmtSevice;
@Component
public class StudentRunner implements CommandLineRunner {
@Autowired
private IStudentMgmtSevice iStudentMgmtSevice;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student=new Student();
//		student.setSid(12345);
//		student.setSname("rahul");
//		student.setSfee(7867.455);
//		System.out.println(iStudentMgmtSevice.saveStudent(student));
		System.out.println("student find by id"+iStudentMgmtSevice.serachByStudentid(123));

	}

}
