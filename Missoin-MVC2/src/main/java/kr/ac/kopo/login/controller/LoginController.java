package kr.ac.kopo.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.framework.annotation.Controller;
import kr.ac.kopo.framework.annotation.RequestMapping;


// @Controller�� �پ������� �갡 �������� ���� �� �� ����.

@Controller
public class LoginController {
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println("login() ȣ��...");
		//���⼭�� retrun ���� model and view�� ������~! �տ����� String�� ���¾��� 
		//���������� �����Ϸ��� �ϴ� �𵨰� forward ��Ű���� �͵��� ��ģ�� model and view ��� �� 
		
		return null;
	}
}