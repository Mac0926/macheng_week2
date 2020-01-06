package com.mc.service;

import com.github.pagehelper.PageInfo;
import com.mc.domain.Nianjian;
import com.mc.domain.Vo;

public interface NianService {

	PageInfo<Nianjian> getNianList(Vo vo, int pageNum);

}
