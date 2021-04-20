/*
 * 
 */
package kr.hs.study.dto;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginDTO {

	private String userid;
	private String userpassword;
	
	
	public LoginDTO() {
		super();
	}

	public LoginDTO(String userid, String userpassword) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
	}

	
	
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
}
