package com.SpringBoard.Cha.service;

import java.util.List;

import com.SpringBoard.Cha.dto.Saram;

public interface SaramService {
	void addSaram(Saram saram);
	List<Saram> getSaramList();
	Saram getSaraminfo(String id); //로그인에 사용
}
