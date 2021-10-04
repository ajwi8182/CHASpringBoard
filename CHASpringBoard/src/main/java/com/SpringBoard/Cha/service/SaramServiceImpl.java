package com.SpringBoard.Cha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoard.Cha.dao.SaramDAO;
import com.SpringBoard.Cha.dto.Saram;

@Service
public class SaramServiceImpl implements SaramService {
	@Autowired
	private SaramDAO saramDAO;

	@Override
	public void addSaram(Saram saram) {
		saramDAO.insertSaram(saram);
	}

	@Override
	public List<Saram> getSaramList() {
		return saramDAO.selectSaramList();
	}

	@Override
	public Saram getSaraminfo(String id) {
		return saramDAO.selectSaraminfo(id);
	}
}
