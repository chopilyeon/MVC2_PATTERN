package kr.ac.kopo.framework;

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {

	//forward와 공융영역 객체에 저장하기 위함임.
	
	private String view;
	private Map<String, Object> model;
	
	public ModelAndView() {
		model = new HashMap<>();
		
		
	}
	
	
	public String getView() {
		return view;
	}


	public void setView(String view) {
		this.view = view;
	}


	public Map<String, Object> getModel() {
		return model;
	}


	public void setModel(Map<String, Object> model) {
		this.model = model;
	}


	public ModelAndView(String view) {
		this();
		this.view = view;	
	}
	
	public void setAttribute(String key,Object value) {
		model.put(key, value);
		
	}
	
}




