package aop002;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;


@Aspect // 이 클래스를 이제 AOP 에서 사용하겠다는 의미이다.

public class MyAspect {
	@Before("execution(public void aop002.Boy.runSomething())")
	// @before 는 대상 메서드 실행 전에 이 메서드를 실행하겠다는 의미다.
	public void before(JoinPoint joinPoint) {
		// join point 는 @before 에서 선언된 메서드인 aop002.boy.runsomething() 을 의미한다. 
		
		System.out.println("얼굴 인식 확인 : 문을 개방하라 ");
	}
}
