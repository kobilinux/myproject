package kr.co.ikosmo.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ikosmo.mvc.vo.MeMMemberVO;

@Repository
public class MemMemberDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	// 로그인 처리 
	public MeMMemberVO loginSession(MeMMemberVO vo) { // 이멜,비번
		return ss.selectOne("login.login_pro", vo); //cnt,name반환
	}
}
