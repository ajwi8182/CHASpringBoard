package com.SpringBoard.Cha.dao;

import java.util.List;

import com.SpringBoard.Cha.dto.SJBoard;

public interface SJBoardDAO {
	int insertBoard(SJBoard sjBoard);
	List<SJBoard> selectBoardList();
	SJBoard selectBoardPost(String boardSubject);
	int deleteBoardPost(String boardSubject);
}
