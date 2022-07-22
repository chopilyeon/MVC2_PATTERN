package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardService {
	private BoardDAO boardDao;
	
	
	
	public BoardService(BoardDAO boardDao) {
		//자기 혼자로는 객체가 못만들어짐 -> 의존성을 갖고 있음. 외부에서 뭔가 있어야 함. dependency injection 의존 주입 자신이 객체를 만들지 않고 외부에서 받아서 사용하는 것임. 
		//객체를 개발자가 만들지 않고 외부에서 갖고 오는 방식임
		
		//boardDao = new BoardDAO();
		this.boardDao = boardDao;
	}
	
	/*
	 * 전체 게시글 조회
	 * 
	 * 
	 */
	public List<BoardVO> selectAllBoard(){
		
		List<BoardVO> boardList = boardDao.selectAll();
		return boardList;
		
	}
	
	
	public void addBoard(BoardVO board) {
		
		int no = boardDao.selectBoardNo();
		board.setNo(no);
		boardDao.insertBoard(board);
		
		
	
	}
	
	public BoardVO selectBoardByNo(int no) {
		
		return boardDao.selectByNo(no);
	}
	
	
	

}
