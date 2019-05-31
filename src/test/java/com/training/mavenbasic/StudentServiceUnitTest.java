package com.training.mavenbasic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

//spring testing framework provides Test class Runner
//need to add support for Runner class (integrates with JUnit)
@RunWith(SpringJUnit4ClassRunner.class)
//load and add support for Spring config class that exposes the bean(that is supposed to be tested)
//add suppport for annotation based injection
@ContextConfiguration(classes=AppConfig.class, loader=AnnotationConfigContextLoader.class)
public class StudentServiceUnitTest {
	//inject the dependency (bean to test)
	@Autowired
	private StudentService service;
	
	//prepare and clean up methods
	
	//prepare : get executed auto before any of the test methods in test class
	@BeforeClass
	public static void setUp() {
		//initialization tasks...
	}
	
	
	
	//adding test cases
	//Test cases : are defined as method decorated with @Test
	
	//check if an appropriate (excepted) Student Service impl is being injected
	@Test
	public void testImplType() {
		//assert methods of JUNIT
		//assertEqual(<expected>,<actual>);
		assertEquals("class com.training.mavenbasic.StudentServiceImpl", this.service.getClass().toString());
	}
	
	@Test
	public void testContactNumber() {
		assertTrue(this.service.getStudentContact(3).startsWith("3"));
	}
	
	@Test
	public void testObjectFetch() {
		Student student=this.service.getStudent(6);
		assertNotNull(student);
	}
	
	//clean up : executed auto after all test cases has been executed
	@AfterClass
	public static void cleanUp() {
		//clean up activity
	}
	
	
}
