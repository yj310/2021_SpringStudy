package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	
	public void beforeMethod() {
		System.out.println("before 메서드 호출");
	}
	
	public void afterMethod() {
		System.out.println("after 메서드 호출");
	}
	
	public void aroundMethod1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around 메서드 호출 전");
		pjp.proceed();	// 실제 메서드(비지니스 로직) 호출
		System.out.println("around 메서드 호출 후");
	}

	public int aroundMethod2(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around2 메서드 호출전");
		int a=(Integer) pjp.proceed(); /*실제 메서드(비지니스 로직) 호출*/
		System.out.println("around2 메서드 후");
		return a;
	}
	
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing 메서드 호출");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning 메서드 호출");
	}
}
