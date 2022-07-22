package kr.ac.kopo.board.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.framework.ModelAndView;
import kr.ac.kopo.framework.annotation.Controller;
import kr.ac.kopo.framework.annotation.RequestMapping;





@Controller
public class BoardController {
	
	/*
	 * @RequestMapping(value="/board/list.do") 
	 * int a; 위에 쓰면 에러남
	 */	
	
	
	//공유영역에 등록시키고 forward 시키려는 주소를 가진놈이 ModelAndView임. 
	
	
	@RequestMapping(value="/board/list.do")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//new 하지 않겠다는 뜻임. 
		ServletContext sc = request.getServletContext();
		
		BoardService service = (BoardService)sc.getAttribute("boardService");
		
		//new  는 이제 사라진다~! 
		//여기서 service 객체만 얻어오자~! 
		
		//이 모든 과정을 servlet context가 할 것이다! 
		//BoardService service = new BoardService();
		//BoardService 쓰려면 DAO 필요함. 
		List<BoardVO> boardList = service.selectAllBoard();
		
		
		ModelAndView mav = new ModelAndView("/jsp/board/list.jsp");
		
		mav.setAttribute("list",boardList); //공유영역에 넣으라고 모델객체에 써준거임.
		
		
		
		System.out.println("list()호출");
		
		return mav;
	}
	
	
	
	//value생략 가능 default로 잡아줌. 
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		ServletContext sc = request.getServletContext();
		
		BoardService service = (BoardService)sc.getAttribute("boardService");
		
		BoardVO board = service.selectBoardByNo(no);
		
		
		ModelAndView mav = new ModelAndView();
		mav.setView("/jsp/board/detail.jsp");
		mav.setAttribute("board", board);
		
		
		
		
		
		System.out.println("detail() 호출");
		
		
		return mav;
	}
	
	@RequestMapping("/board/writeForm.do")
	public ModelAndView writeForm(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		ModelAndView mav = new ModelAndView("/jsp/board/writeForm.jsp");
		return mav;
	}
	
	

}