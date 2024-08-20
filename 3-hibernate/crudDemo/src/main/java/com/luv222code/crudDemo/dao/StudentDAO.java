package com.luv222code.crudDemo.dao;

import java.util.List;

import com.luv222code.crudDemo.entity.Student;

public interface StudentDAO {

	void save(Student student);
	Student read(Integer id);
	List<Student> readAll();
	List<Student> readLastName(String lastName);
	void update(Student student);
	void deleteByLastName(String lastName);
	void delete(Integer id);
	int deleteAll();
}
