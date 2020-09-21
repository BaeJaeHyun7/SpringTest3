package com.sesoc.day0821;


public class UserVO {
	private String userid;
	private String userpw;
	
	public UserVO() {
	
	}

	public UserVO(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
}
