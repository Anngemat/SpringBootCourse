package com.luv222code.crudDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv222code.crudDemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAOImpl implements StudentDAO{

	private EntityManager entityManager;
	
	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	@org.springframework.transaction.annotation.Transactional
	public void save(Student student) {
		//Saves the student (C of CRUD)
		entityManager.persist(student);
	}
	//transactional database de işlem yaparken güncelleme gibi, bu yüzden reeadde yok
	@Override
	public Student read(Integer id) {
		return entityManager.find(Student.class, id);
	}
	//Hepsini okumak için
	@Override
	public List<Student> readAll() {
		//lastName de javadakini kullandık databasedeki last_name di
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName asc",Student.class);
		return theQuery.getResultList();
	}
	@Override
	public List<Student> readLastName(String lastName) {
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student where lastName=:theData",Student.class);
		theQuery.setParameter("theData", lastName);
		return theQuery.getResultList();
	}
	@Override
	@org.springframework.transaction.annotation.Transactional
	public void update(Student student) {
		entityManager.merge(student);		
	}
	//Last name ile silmek
	@Override
	@org.springframework.transaction.annotation.Transactional
	public void deleteByLastName(String lastName) {
		int theQuery = entityManager.createQuery("Delete From Student where lastName=:theData")
				.setParameter("theData", lastName).executeUpdate();
	}
	@Override
	@org.springframework.transaction.annotation.Transactional
	public void delete(Integer id) {
		Student aStudent = entityManager.find(Student.class, id);
		entityManager.remove(aStudent);
		
	}
	@Override
	@org.springframework.transaction.annotation.Transactional
	public int deleteAll() {
		int theQuery = entityManager.createQuery("Delete From Student").executeUpdate();
		return theQuery;
	}
	 
	
	
	

}
