package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SpringDaoImpl implements ISpringDao {
	
	private final String NS = "com.min.edu.SpringDaoImpl.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public int useageUpdate() {
		return sqlSession.update(NS+"useageUpdate");
	}

}
