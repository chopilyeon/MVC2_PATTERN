package kr.ac.kopo.framework.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


//target type이면 class임.
@Retention(RUNTIME)
@Target(TYPE)
public @interface Controller {

	
	
}
