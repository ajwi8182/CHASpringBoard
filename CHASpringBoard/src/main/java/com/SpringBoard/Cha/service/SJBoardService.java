package com.SpringBoard.Cha.service;

import java.util.List;

import com.SpringBoard.Cha.dto.SJBoard;
public interface SJBoardService {
	void addSJBoard(SJBoard sjBoard);
	List<SJBoard> getSJBoardList();
	SJBoard getBoardPost(int boardPostNum);
	void removeBoardPost(int boardPostNum);
}
