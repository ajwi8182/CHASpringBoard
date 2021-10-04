package com.SpringBoard.Cha.dao;

import java.util.List;

import com.SpringBoard.Cha.dto.Saram;

public interface SaramDAO {
	int insertSaram(Saram saram);
	Saram selectSaraminfo(String id);
	List<Saram> selectSaramList();
}
