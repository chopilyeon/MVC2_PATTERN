package kr.ac.kopo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.service.BoardService;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */

	//<listner.> 하면서 원래는 만들어야 하는데 annotation으로 맨처음 알아서 하게 함.
@WebListener
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    
    
    //맨 처음이도 마지막에 구동되는 놈도 listner임. 
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    //event로 매개변수도 바꿔주자~! framework가 객체들 관리하게 해주자!~ 
    //내가 직접 new 그런거 안해도 다 알아서 하게 하고 싶음. back단에서 알아서 하게 하고 싶다!!~ 
    //스프링인 contatiner에서 이 역할을 해줌. 객체를 개발자가 만드는게 아니라 만들어진 걸 갖고 와서 조립하는 형태가 됨. 
    public void contextInitialized(ServletContextEvent event)  { 
    	
    	
    	System.out.println("리스너 시작");
         // TODO Auto-generated method stub
    
    	ServletContext sc = event.getServletContext();
    	
    	BoardDAO boardDao = new BoardDAO();
    	
    	

    	//BoardService boardService = new BoardService();
    	
    	BoardService boardService = new BoardService(boardDao);
    	//이걸 어딘가에 집어넣고 사용해야 함.
    	//servlet context에 집어넣고 사용할 것임 -> servlet끼리 값을 공유할 수 있는 놈들임. 
    	
    	//boardDao를 집어넣자~! 
  
    	
    	//sc.setAttribute("boardDao", boardDao);
    	sc.setAttribute("boardSerivce", boardService);
		//BoardService 쓰려면 DAO 필요함. 
    
    }
    
    
    
	
}
