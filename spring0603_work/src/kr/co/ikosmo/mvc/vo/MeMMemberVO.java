package kr.co.ikosmo.mvc.vo;

public class MeMMemberVO {
private String mem_email,mem_pwd,mem_name,mem_date;
private int cnt;


public String getMem_name() {
	return mem_name;
}

public void setMem_name(String mem_name) {
	this.mem_name = mem_name;
}

public String getMem_date() {
	return mem_date;
}

public void setMem_date(String mem_date) {
	this.mem_date = mem_date;
}

public int getCnt() {
	return cnt;
}

public void setCnt(int cnt) {
	this.cnt = cnt;
}

public String getMem_email() {
	return mem_email;
}

public void setMem_email(String mem_email) {
	this.mem_email = mem_email;
}

public String getMem_pwd() {
	return mem_pwd;
}

public void setMem_pwd(String mem_pwd) {
	this.mem_pwd = mem_pwd;
}

}
