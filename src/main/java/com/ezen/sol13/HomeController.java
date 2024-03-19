package com.ezen.sol13;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@Autowired //�������� ���ට���� ����̺� ����ȯ���� �ڵ����� ����
	SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/")
	public String ko1() {
		
		return "main";
	}
	
	@RequestMapping(value = "/main")
	public String ko01() {
		
		return "main";
	}
	
	@RequestMapping(value = "/in")
	public String ko2() {
		
		return "input";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String ko3(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		Service ss = sqlSession.getMapper(Service.class);
		ss.inserta(name,age,address);
		
		return "redirect:/"; // �������� ����� ����
	}
	
	@RequestMapping(value = "/out")
	public String ko4(Model mo) {
		
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<MyinfoDTO>list = ss.print();
		mo.addAttribute("list", list);
		return "outa";
	}
	
	@RequestMapping(value = "/delete")
	public String ko5(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		Service ss = sqlSession.getMapper(Service.class);
		ss.delinfo(name);
		
		return "main";
	}
	
	@RequestMapping(value = "/sout")
	public String sil1(Model mo) {
		
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<InfoDTO> list = ss.payout();
		mo.addAttribute("list", list);
		
		
		return "sout";
	}
	
	
}
