package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		LoginDTO bean1 = ctx.getBean("LoginDTO", LoginDTO.class);
		bean1.setUserid("kim");
		bean1.setUserpassword("1111");
		
		LoginDAO dao = ctx.getBean("LoginDAO", LoginDAO.class);
		
		
		dao.insert_data(bean1);
		System.out.println("데이터 저장완료");
		
		ctx.close();
		
	}

}
