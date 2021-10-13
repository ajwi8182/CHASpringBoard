package com.SpringBoard.Cha.mapper;

import java.util.List;

import com.SpringBoard.Cha.dto.SJBoard;

public interface SJBoardMapper {
	int insertBoard(SJBoard sjBoard);
	List<SJBoard> selectBoardList();
	SJBoard selectBoardPost(int boardPostNum);
	int deleteBoardPost(int boardPostNum); /*게시물 삭제*/
}
