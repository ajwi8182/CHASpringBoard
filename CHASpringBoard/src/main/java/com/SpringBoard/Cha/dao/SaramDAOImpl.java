package com.SpringBoard.Cha.dao;

import java.util.List;

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
	@Override
	public List<Saram> selectSaramList(){
		return sqlSession.getMapper(SaramMapper.class).selectSaramList();		
	}
	
	@Override
	public Saram selectSaraminfo(String id) {
		return sqlSession.getMapper(SaramMapper.class).selectSaraminfo(id);
	}
}
