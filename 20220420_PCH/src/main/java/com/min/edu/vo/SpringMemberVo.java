package com.min.edu.vo;

public class SpringMemberVo {

	private String id;
	private String pw;
	private String auth;
	private String delflag;
	private String regdate;
	
	
	public SpringMemberVo() {
		// TODO Auto-generated constructor stub
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


	public String getAuth() {
		return auth;
	}


	public void setAuth(String auth) {
		this.auth = auth;
	}


	public String getDelflag() {
		return delflag;
	}


	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "SpringMemberVo [id=" + id + ", pw=" + pw + ", auth=" + auth + ", delflag=" + delflag + ", regdate="
				+ regdate + "]";
	}


	public SpringMemberVo(String id, String pw, String auth, String delflag, String regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.auth = auth;
		this.delflag = delflag;
		this.regdate = regdate;
	}
	
	
	

}
