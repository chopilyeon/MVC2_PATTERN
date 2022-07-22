package kr.ac.kopo.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {
	
	//JVM이 인식하는 주석 @을 인식함
	//언제까지 유지시킬거야? 
	//COMPILE 시점까지 유지시킬거야?
	//RUNTIME시점 까지 유지시킬거야? -> 이런 것들이 필요함
	//유지하는 시기가  RUNTIME시 까지임.
	
	
	//@ 니가 만든 annotation이 어디에 붙을거야? 멤버변수? 클래스 메소드? 어디에 붙일거야? 다 결정할 수 있음. -> 우리는 메소드에 붙인ㄷ!  
	//@override는 지금 알아서 붙여주는거임. 내부적으로 알아서 붙여줌. 원래는 꼭 붙여줘야 하는 것임. 무조건 꼭 붙여줘야 했지만 내부적으로 붙여줌. 
	
	//나 이제 @RequestMapping 이라는 메소드를 만들었고 method에만 붙일 수 있는 애야! value="" 근데 그게 만드시 문자열이어야 해! value = 문자열! "" 이므로~! 
	//value는 생략되어도 별 문제는 없음.
	//value 가 string 형태로 쓰이게 하자! 
	String value();
}
