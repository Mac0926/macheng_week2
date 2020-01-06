package com.mc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mc.dao.NianMapper;
import com.mc.domain.Nianjian;
import com.mc.domain.Vo;
import com.mc.service.NianService;

@Service
public class NianServiceImpl implements NianService {

	@Autowired
	private NianMapper mapper;
	
	@Override
	public PageInfo<Nianjian> getNianList(Vo vo, int pageNum) {

		PageHelper.startPage(pageNum, 3);
		
		List<Nianjian> list=mapper.getNianList(vo);
		
		PageInfo<Nianjian> info = new PageInfo<Nianjian>(list);
		
		return info;
	}

}
