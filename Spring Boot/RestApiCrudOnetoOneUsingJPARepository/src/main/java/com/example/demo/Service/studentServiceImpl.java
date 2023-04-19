package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.studentRepo;
import com.example.demo.entity.student;
@Service
public class studentServiceImpl implements studentService {

	@Autowired
	private studentRepo studentRepo;

	@Override
	public void addstudData(student student) {
		studentRepo.save(student);
	}

	@Override
	public student getLogindata(String un, String ps) {
		
		student student =studentRepo.findByLoginUnameAndLoginPass(un, ps);
		
		return student;
	}

	@Override
	public List<student> getAllData() {
		List<student>slist=studentRepo.findAll();
		return slist;
	}
}