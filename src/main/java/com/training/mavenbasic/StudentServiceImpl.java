package com.training.mavenbasic;

import java.util.ArrayList;
import java.util.List;



public class StudentServiceImpl implements StudentService {

	//dummy student list
	private List<Student> students;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		//initialize student list
		
		this.students=new ArrayList<>();
		students.add(new Student(1,"First","first@mail.com","123456"));
		students.add(new Student(2,"Second","second@mail.com","234567"));
		students.add(new Student(3,"Third","third@mail.com","345678"));
		students.add(new Student(4,"Fourth","fourth@mail.com","456789"));
	}
	
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		if(id >=1 && id<=this.students.size())
			return this.students.get(id-1);
		return null;
	}

	@Override
	public String getStudentContact(int id) {
		// TODO Auto-generated method stub
		Student student=this.students.get(id-1);
		return student.getContact();
	}

}
