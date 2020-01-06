package com.mc.service.impl;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.mc.domain.Nianjian;
import com.mc.service.NianService;
import com.mc.util.NumberUtil;
import com.mc.util.StreamUtil;
import com.mc.util.StringUtil;

public class NianServiceImplTest {

	 @Resource
	  private NianService service;
	 
	@Test
	public void testSelects() {
		fail("Not yet implemented");
	}

	@Test//导入数据
	public void testInsert() throws Exception {
		
		List<Nianjian> goodsList =new ArrayList<Nianjian>();
	
		//调用工具类
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
	  for (int j = 1; j < list.size(); j++) {
			 Nianjian goods = new Nianjian();
			 String[] s = list.get(j).split("\\==");
			 goods.setNid(Integer.parseInt(s[0]));//封装ID
			 if(StringUtil.hasText(s[1]))
			 goods.setNname(s[1]);
			 
	  }
	  }

}
