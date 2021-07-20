package com.SpringBoard.Cha.mapper;

import java.util.List;

import com.SpringBoard.Cha.dto.Saram;

public interface SaramMapper {
	int insertSaram(Saram saram);
	List<Saram> selectSaramList();
}
