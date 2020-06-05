package kr.co.ikosmo.mvc.model;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ikosmo.mvc.dao.MemMemberDao;
import kr.co.ikosmo.mvc.vo.MeMMemberVO;

@Controller
public class MemMemberController {

	@Autowired
	private MemMemberDao memMemberDao;
	
	@RequestMapping(value="/loginF")
	public String viewMem() {
		
		return "login/loginForm";
	}
	
	// �α��� ó���� ���ؼ� ������ ����
	@RequestMapping(value = "/loginPro")
	public String loginProcess(HttpSession session, MeMMemberVO v) {// �̸�,��� ���ּ�
		// cnt,�̸�
		MeMMemberVO vv = memMemberDao.loginSession(v);
		String urlPah ="";
		if(vv.getCnt()  ==  1 ) { //�α���
			session.setAttribute("mem_uid", vv.getMem_name());
			 urlPah ="redirect:index";
		}else {// �߸�
			 urlPah ="redirect:errr";
		}
		return urlPah;
	}
	// �α׾ƿ� logout
	@RequestMapping(value="/logout")
	public String logoutpro(HttpSession session) {
		session.removeAttribute("mem_uid");
		String urlPah ="redirect:index";
		return urlPah;
	}
	
	
	@RequestMapping(value="/errr")
	public String loginerr(Model m) {
		m.addAttribute("msg", "������");
		return "login/error";
	}
	
	/*
	 * 
create table memmember(
num number primary key,
mem_email varchar2(50) not null,
mem_pwd varchar2(10) not null,
mem_name varchar2(25),
mem_date date,
constraint memmember_mem_email_uq unique(mem_email));

create sequence memmember_seq
increment by 1
start with 1;
insert into memmember values(memmember_seq.nextVal,'javabook@naver.com','test00','��浿',sysdate);
commit;
select * from memmember;
	 * */
}
