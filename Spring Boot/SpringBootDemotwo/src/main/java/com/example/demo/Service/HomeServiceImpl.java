package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.HomeDao;
import com.example.demo.entity.Student;
@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeDao homedao;

	@Override
	public void AddStudentdata(Student student) {
		homedao.AddStudentdata(student);
		
	}

	@Override
	public List<Student> getLoginData(String uname, String pass) {
		return homedao.getLoginData(uname, pass);
	}

	@Override
	public Student getEditData(int id) {
		return homedao.getEditData(id);
	}

	@Override
	public List<Student> getUpadtedinfo(Student student) {
		return homedao.getUpadtedinfo(student);
	}

	@Override
	public List<Student> getDeletedinfo(int id) {
		return homedao.getDeletedinfo(id);
	}

}
