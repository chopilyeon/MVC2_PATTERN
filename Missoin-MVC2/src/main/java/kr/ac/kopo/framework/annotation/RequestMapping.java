package kr.ac.kopo.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {
	
	//JVM�� �ν��ϴ� �ּ� @�� �ν���
	//�������� ������ų�ž�? 
	//COMPILE �������� ������ų�ž�?
	//RUNTIME���� ���� ������ų�ž�? -> �̷� �͵��� �ʿ���
	//�����ϴ� �ñⰡ  RUNTIME�� ������.
	
	
	//@ �ϰ� ���� annotation�� ��� �����ž�? �������? Ŭ���� �޼ҵ�? ��� ���ϰž�? �� ������ �� ����. -> �츮�� �޼ҵ忡 ���Τ�!  
	//@override�� ���� �˾Ƽ� �ٿ��ִ°���. ���������� �˾Ƽ� �ٿ���. ������ �� �ٿ���� �ϴ� ����. ������ �� �ٿ���� ������ ���������� �ٿ���. 
	
	//�� ���� @RequestMapping �̶�� �޼ҵ带 ������� method���� ���� �� �ִ� �־�! value="" �ٵ� �װ� ����� ���ڿ��̾�� ��! value = ���ڿ�! "" �̹Ƿ�~! 
	//value�� �����Ǿ �� ������ ����.
	//value �� string ���·� ���̰� ����! 
	String value();
}