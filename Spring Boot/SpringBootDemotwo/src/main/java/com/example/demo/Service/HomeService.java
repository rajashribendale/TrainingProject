package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Student;

public interface HomeService {
	void AddStudentdata(Student student);

	List<Student> getLoginData(String uname, String pass);

	Student getEditData(int id);

	List<Student> getUpadtedinfo(Student student);

	List<Student> getDeletedinfo(int id);
}
