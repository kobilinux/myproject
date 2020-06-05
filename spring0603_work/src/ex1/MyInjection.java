package ex1;

import org.springframework.beans.factory.annotation.Autowired;

public class MyInjection {
	@Autowired
	private String jndiname;

	public String getJndiname() {
		return jndiname;
	}
//
//	public void setJndiname(String jndiname) {
//		this.jndiname = jndiname;
//	}
	
}
