package kr.co.ikosmo.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ikosmo.mvc.dao.MemberDao;
//JSON or 커스텀 뷰를 만들 때 사용 가능 
@RestController
public class IdCheckRestController {
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping(value="/idChk")
	public int idChk(String id) {
		int cnt = memberDao.memberIdchk(id);
		return cnt;
	}

}
