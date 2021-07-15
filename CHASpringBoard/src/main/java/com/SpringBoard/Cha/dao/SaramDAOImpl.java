package com.SpringBoard.Cha.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoard.Cha.dto.Saram;
import com.SpringBoard.Cha.mapper.SaramMapper;

@Repository
public class SaramDAOImpl implements SaramDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertSaram(Saram saram) {
		return sqlSession.getMapper(SaramMapper.class).insertSaram(saram);
	}
	
}
