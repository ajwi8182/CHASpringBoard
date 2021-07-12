package com.SpringBoard.Cha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoard.Cha.dao.SaramDAO;
import com.SpringBoard.Cha.dto.Saram;

@Service
public class SaramServiceImpl implements SaramService{
	@Autowired
	private SaramDAO saramDAO;
	
	@Override
	public void addSaram(Saram saram) {
		saramDAO.insertSaram(saram);	
		}
}
