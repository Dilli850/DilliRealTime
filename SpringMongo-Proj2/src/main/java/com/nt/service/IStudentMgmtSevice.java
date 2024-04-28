package com.nt.service;

import com.nt.document.Student;

public interface IStudentMgmtSevice {
public String  saveStudent(Student student);
public Student serachByStudentid(Integer sid);
}
