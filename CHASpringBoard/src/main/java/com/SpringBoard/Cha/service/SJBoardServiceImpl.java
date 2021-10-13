package com.SpringBoard.Cha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoard.Cha.dao.SJBoardDAO;
import com.SpringBoard.Cha.dto.SJBoard;

@Service
public class SJBoardServiceImpl implements SJBoardService{
	@Autowired
	private SJBoardDAO sjBoardDAO;
	
	@Override
	public void addSJBoard(SJBoard sjBoard) {
		sjBoardDAO.insertBoard(sjBoard);
	}
	
	@Override
	public List<SJBoard> getSJBoardList(){
		return sjBoardDAO.selectBoardList();
	}
	
	@Override
	public SJBoard getBoardPost(int boardPostNum) {
		return sjBoardDAO.selectBoardPost(boardPostNum);
	}
	
	@Transactional
	@Override
	public void removeBoardPost(int boardPostNum) {
		sjBoardDAO.deleteBoardPost(boardPostNum);
	}
}
