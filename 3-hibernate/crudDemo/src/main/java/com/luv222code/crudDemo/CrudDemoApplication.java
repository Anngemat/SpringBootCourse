package com.luv222code.crudDemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.context.annotation.Bean;

import com.luv222code.crudDemo.dao.StudentDAO;
import com.luv222code.crudDemo.entity.Student;

@SpringBootApplication
public class CrudDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//deleteAll(studentDAO);
			//deleteStudent(studentDAO);
			//deleteByLastNameStudent(studentDAO);
			//updateStudent(studentDAO);
			//readAllStudentsLastName(studentDAO);
			//readAllStudents(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		int numRowsDeleted =studentDAO.deleteAll();
		System.out.println(numRowsDeleted);
		
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1;
		studentDAO.delete(studentId);
	}

	private void deleteByLastNameStudent(StudentDAO studentDAO) {
		studentDAO.deleteByLastName("Duck");
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student aStudent = studentDAO.read(studentId);
		aStudent.setFirstName("Paul");
		studentDAO.update(aStudent);
		
	}

	private void createStudent(StudentDAO studentDAO) {
		
		Student newStudent = new Student("Paul","Doe","paul@luv2code.com");
		studentDAO.save(newStudent);
		System.out.println(newStudent.getId());
		
	}
	
	private void createMultipleStudents(StudentDAO studentDAO) {
		Student newStudent2 = new Student("John","Doe","john@luv2code.com");
		Student newStudent3 = new Student("Jane","Doe","jane@luv2code.com");
		Student newStudent4 = new Student("July","Doe","july@luv2code.com");
		studentDAO.save(newStudent2);
		studentDAO.save(newStudent3);
		studentDAO.save(newStudent4);
		System.out.println(newStudent2.getId() + " " + newStudent3.getId() + " " + newStudent4.getId());
		
	}
	
	private void readStudent(StudentDAO studentDAO) {
		Student tempStudent = new Student("Daffy","Duck","dduck@luv2code.com");
		studentDAO.save(tempStudent);
		int theId = tempStudent.getId();
		Student newStudent6 = studentDAO.read(theId);
		System.out.println(newStudent6);
		/* hepsini basmanın farklı yöntemi
		 for(int i=1;i<50;i++){
		 Student newStudents = studentDAO.read(i);
		 System.out.println(newStudents);
		 }
		 */
	}
	private void readAllStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.readAll();
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}
	
	private void readAllStudentsLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.readLastName("Duck");
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}
	
}
