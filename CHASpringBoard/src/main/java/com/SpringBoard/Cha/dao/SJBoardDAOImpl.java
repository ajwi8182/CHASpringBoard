package com.SpringBoard.Cha.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoard.Cha.dto.SJBoard;
import com.SpringBoard.Cha.mapper.SJBoardMapper;

@Repository
public class SJBoardDAOImpl implements SJBoardDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertBoard(SJBoard sjBoard) {
		return sqlSession.getMapper(SJBoardMapper.class).insertBoard(sjBoard);
	}
	
	@Override
	public List<SJBoard> selectBoardList(){
		return sqlSession.getMapper(SJBoardMapper.class).selectBoardList();
	}
	
	@Override
	public SJBoard selectBoardPost(String boardSubject) {
		return sqlSession.getMapper(SJBoardMapper.class).selectBoardPost(boardSubject);
	}
	
	@Override
	public int deleteBoardPost(String boardSubject) {
		return sqlSession.getMapper(SJBoardMapper.class).deleteBoardPost(boardSubject);
	}
}
