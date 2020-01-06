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

	
//	a. id���ģ����ѯ��2�֣�
//	b. keywordsģ����ѯ��2�֣�
//	c. descriptionģ����ѯ��2�֣�
//	d. ��˾����ģ����ѯ��2�֣�
//	e. ��Ӫ��Ʒģ����ѯ��2�֣�
//	f. ��ַģ����ѯ��2�֣�
//	g. ע���ʱ���Χ��ѯ��2�֣�
//	h. ����ʱ�䷶Χ��ѯ��2�֣�
//	i. ������ڷ�Χ��ѯ��2�֣�
//	j. ���״̬ѡ���ѯ���ֹ������0��2��
	
	
	@Autowired
	private NianService service;
	
	
//	10.��˾����ѯ�б�5�֣�
//	a.�б����������ֶΣ���ȫ���߷������󣬼�0��2�֣�
//	b.��ҳ����ʽΪ:�ܼ�¼/��ҳ�� ҳ����ϵ�� ���� 2,3,4...
//	   ��תXҳ, ������������ȷ,�����0��3�֣�
	
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
