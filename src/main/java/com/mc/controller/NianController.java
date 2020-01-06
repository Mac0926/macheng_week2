package com.mc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.mc.domain.Nianjian;
import com.mc.domain.Vo;
import com.mc.service.NianService;

@Controller
public class NianController {

	
//	a. id编号模糊查询（2分）
//	b. keywords模糊查询（2分）
//	c. description模糊查询（2分）
//	d. 公司名称模糊查询（2分）
//	e. 主营产品模糊查询（2分）
//	f. 地址模糊查询（2分）
//	g. 注册资本范围查询（2分）
//	h. 成立时间范围查询（2分）
//	i. 年检日期范围查询（2分）
//	j. 年检状态选择查询，手工输入计0（2分
	
	
	@Autowired
	private NianService service;
	
	
//	10.公司年检查询列表（5分）
//	a.列表，包含所有字段，不全或者发生错误，计0（2分）
//	b.分页，格式为:总记录/总页数 页码编号系列 比如 2,3,4...
//	   跳转X页, 必须完整并正确,否则计0（3分）
	
	@RequestMapping("list.do")
	public String getNianList(Nianjian nian,Vo vo,@RequestParam(defaultValue="1")int pageNum,Model model) {
		
		PageInfo<Nianjian> info=service.getNianList(vo,pageNum);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		model.addAttribute("pageNum", pageNum);
		return"list";
	}
	
	@RequestMapping("upd.do")
	public String upd(int nid,Nianjian nian,Model model) {
		
		model.addAttribute("nid", nid);
		model.addAttribute("nian", nian);
		
		return"upd";
	}
	
}
