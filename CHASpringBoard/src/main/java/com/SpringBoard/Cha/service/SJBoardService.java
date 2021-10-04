package com.SpringBoard.Cha.service;

import java.util.List;

import com.SpringBoard.Cha.dto.SJBoard;
public interface SJBoardService {
	void addSJBoard(SJBoard sjBoard);
	List<SJBoard> getSJBoardList();
	SJBoard getBoardPost(String boardSubject);
	void removeBoardPost(String boardSubject);
}
