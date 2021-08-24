package kr.hs.study.model.dto;

public class MemberDTO {
	private String userid;
	private String passwd;
	private String name;
	private String email;
	private String join_date;
	
	
	
	public MemberDTO() {
		super();
	}


	public MemberDTO(String userid, String passwd, String name, String email, String join_date) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.join_date = join_date;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getJoin_date() {
		return join_date;
	}


	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	
	
	
}
