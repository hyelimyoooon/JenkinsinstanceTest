package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.min.edu.model.mapper.ISpringDao;


@Service
public class SpringServiceImpl implements ISpringService {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringServiceImpl.class);
	
	@Autowired
	private ISpringDao dao;
	

	
//	@Transactional
//	@Override
//	public int transactionTest(JobsVo vo, String max) {
//		logger.info("JobsServiceImpl jobs transaction 테스트 jobsInsert");
//		return dao.transactionTest(vo, max);
//	}
//	
//	@Transactional
//	@Override
//	public int step11(Map<String, String> map) {
//		logger.info("JobsServiceImpl jobs transaction update//Insert");
//		int n = dao.useageUpdate();
//		n+=dao.jobsInsert(map);
//		return n;
//	}

}
