package com.SpringBoard.Cha.dto;
/*
create table sjboard(board_post_num number primary key, board_writer_id varchar2(20) not null
, board_subject varchar2(500) not null, board_reg_date date
, board_read_count number(5), board_ref number(4), board_re_step number(4)
, board_re_level number(4), board_content varchar2(4000), ip varchar2(20), board_post_status number(1));

CREATE SEQUENCE CHSPBOARD_SEQ;
 * */
public class SJBoard {
	
	private int boardPostNum; 		//�Խñ� ��ȣ
	private String boardWriterId;	//�ۼ��� ID
	private String boardSubject;	//�Խñ� ����
	private String boardRegDate;	//�Խñ� �ۼ�����
	private int boardReadCount;		//�Խñ� ��ȸ��
	private int boardRef;			//�Խñ� �׷�
	private int boardReStep;		//�Խñ� ����
	private int boardReLevel;		//�Խñ� ����
	private String boardContent;	//�Խñ� ����
	private String ip;				//Ŭ���̾�Ʈ IP �ּ�
	private int boardPostStatus;	// �Խñ� ���� >> 0(�Ϲݱ�), 1(��б�), 9(������) <<
	
	public SJBoard() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardPostNum() {
		return boardPostNum;
	}

	public void setBoardPostNum(int boardPostNum) {
		this.boardPostNum = boardPostNum;
	}

	public String getBoardWriterId() {
		return boardWriterId;
	}

	public void setBoardWriterId(String boardWriterId) {
		this.boardWriterId = boardWriterId;
	}

	public String getBoardSubject() {
		return boardSubject;
	}

	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}

	public String getBoardRegDate() {
		return boardRegDate;
	}

	public void setBoardRegDate(String boardRegDate) {
		this.boardRegDate = boardRegDate;
	}

	public int getBoardReadCount() {
		return boardReadCount;
	}

	public void setBoardReadCount(int boardReadCount) {
		this.boardReadCount = boardReadCount;
	}

	public int getBoardRef() {
		return boardRef;
	}

	public void setBoardRef(int boardRef) {
		this.boardRef = boardRef;
	}

	public int getBoardReStep() {
		return boardReStep;
	}

	public void setBoardReStep(int boardReStep) {
		this.boardReStep = boardReStep;
	}

	public int getBoardReLevel() {
		return boardReLevel;
	}

	public void setBoardReLevel(int boardReLevel) {
		this.boardReLevel = boardReLevel;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getBoardPostStatus() {
		return boardPostStatus;
	}

	public void setBoardPostStatus(int boardPostStatus) {
		this.boardPostStatus = boardPostStatus;
	}
}
