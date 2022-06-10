package com.min.edu;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PCH_Test {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Before
	public void before() {
		System.out.println("JUnit Test 시작");
	}
	
	@After
	public void after() {
		System.out.println("JUnit Test 종료");
	}

	
//	@Test
	public void getAll() {
//		List<JobsVo> lists = session.selectList("com.pch.edu.JobsDaoImpl.getAllJobs");
//		System.out.println(lists);
	}
	
	
	@Test
	public void step3Test() {
	    session=context.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
		System.out.println("---------------------------------");
		System.out.println(session.toString());
		System.out.println("---------------------------------");
	}

	
	
//	@Test
	public void useageUpdate() {
		int cnt = session.insert("com.min.edu.JobsDaoImpl.useageUpdate");
		System.out.println("성공한 횟수 : " +cnt);
	}
	
}
