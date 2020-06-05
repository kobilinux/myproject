package kr.co.ikosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ikosmo.mvc.vo.TBoardVO;
// Dao를 빈으로 등록해주는 어노테이션 
// kosomo-spring1.xml의 scanning대상 어노테이션이기 때문에 , 스프링컨테이너에 <bean> 등록이 된다.
@Repository
public class TvoDao {
	@Autowired
	private SqlSessionTemplate ss;
	public void addTvo(TBoardVO vo) {
		//spring + mybatis 생략 ,commit() X, closed() X
		ss.insert("tvo.add", vo);
	}
	
	// selectList
	public List<TBoardVO> listTvo(){
		return ss.selectList("tvo.list");
	}
	// 어울리는 메서드를 정의 해보자.  tvo.pwdChk
	public String pwdChk(int num) {
		return ss.selectOne("tvo.pwdChk", num);
	}
	
	public TBoardVO detailTvo(int num) {
		return ss.selectOne("tvo.detail", num);
	}
}









