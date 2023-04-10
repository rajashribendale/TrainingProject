package com.example.demo.Dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface HomeDao {
	void AddStudentdata(Student student);

	List<Student> getLoginData(String uname, String pass);

	Student getEditData(int id);

	List<Student> getUpadtedinfo(Student student);

	List<Student> getDeletedinfo(int id);

}
