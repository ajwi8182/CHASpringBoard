package com.SpringBoard.Cha.dao;

import java.util.List;

import com.SpringBoard.Cha.dto.Saram;

public interface SaramDAO {
	int insertSaram(Saram saram);
	List<Saram> selectSaramList();
}
