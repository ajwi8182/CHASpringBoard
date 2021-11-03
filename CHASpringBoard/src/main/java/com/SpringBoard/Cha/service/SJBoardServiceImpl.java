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
	
	/*게시판 - 게시판 목록*/
	@Override
	public List<SJBoard> getSJBoardList(){
		return sjBoardDAO.selectBoardList();
	}
	
	/*게시판 - 게시글 추가*/
	@Override
	public void addSJBoard(SJBoard sjBoard) {
		sjBoardDAO.insertBoard(sjBoard);
	}
		
	/*게시판 - 게시글 상세 조회*/
	@Override
	public SJBoard getBoardPost(int boardPostNum) {
		return sjBoardDAO.selectBoardPost(boardPostNum);
	}
	
	/*게시판 - 게시글 삭제*/
	@Transactional
	@Override
	public void removeBoardPost(int boardPostNum) {
		sjBoardDAO.deleteBoardPost(boardPostNum);
	}
}
