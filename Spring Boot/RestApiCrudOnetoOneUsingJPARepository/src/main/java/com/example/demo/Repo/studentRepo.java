package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.student;
@Repository
public interface studentRepo  extends JpaRepository<student	, Integer>{
	
student findByLoginUnameAndLoginPass(String un,String ps);
}
