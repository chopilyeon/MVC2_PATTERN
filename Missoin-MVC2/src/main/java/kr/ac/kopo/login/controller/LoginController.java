package kr.ac.kopo.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.framework.annotation.Controller;
import kr.ac.kopo.framework.annotation.RequestMapping;


// @Controller가 붙어있으면 얘가 무슨일을 할지 알 수 있음.

@Controller
public class LoginController {
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		System.out.println("login() 호출...");
		//여기서는 retrun 값을 model and view를 보내자~! 앞에서는 String을 보냈었음 
		//공유영역에 저장하려고 하는 모델과 forward 시키려는 것들을 합친게 model and view 라고 함 
		
		return null;
	}
}
