package kr.hs.study.model.dto;

public class LoginDTO {

	private String uid;
	private String upass;
	
	
	
	public LoginDTO() {
		super();
	}

	public LoginDTO(String uid, String upass) {
		super();
		this.uid = uid;
		this.upass = upass;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	
	
	
	
	
	
	
}
