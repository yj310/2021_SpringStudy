package kr.hs.study.model.dto;

public class UserDTO {

	private String name;
	private String id;
	private String pw;
	private String email;
	private String address;
	private String address_detail;
	
	
	public UserDTO(String name, String id, String pw, String email, String address, String address_detail) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.address_detail = address_detail;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	
	
	
	
}
