package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hello h1 = ctx.getBean("hK", HelloWorldKo.class);
		h1.sayHello();
		
		Hello h2 = ctx.getBean("hE", HelloWorldEn.class);
		h2.sayHello();
		
		ctx.close();
	}

}
