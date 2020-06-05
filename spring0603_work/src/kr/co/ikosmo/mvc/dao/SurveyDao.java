package kr.co.ikosmo.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ikosmo.mvc.vo.SubveyContentVO;
import kr.co.ikosmo.mvc.vo.SubveyView2VO;
import kr.co.ikosmo.mvc.vo.SurveyVO;

@Repository
public class SurveyDao {

	@Autowired
	private SqlSessionTemplate ss;
	
	public void addSurvey(SurveyVO vo) {
		ss.insert("survey.add", vo);
	}
	public void addSurveyContent(List<SubveyContentVO> list) {
		ss.insert("survey.addcontent", list);
	}
	
	public List<SurveyVO> adminList(){
		return ss.selectList("survey.adminList");
	}
	
	public List<SubveyView2VO> adminDetail(int num){
		return ss.selectList("survey.adminDetail",num);
	}
	

	
	//surveyclientform : 설문지 폼에 출력될 데이터 값 
	public List<SubveyView2VO> surveyView2(){
		return ss.selectList("survey.surveyclient");
	}
	

	
	// mybatis에 정의한 update구문을 실행 
	public void surveyClientUpdate3(SubveyView2VO vo) {
		int res = ss.update("survey.update1", vo);
		System.out.println("res:"+res);
	}
	
	
	
	
	
	
	
	
	
	
	//투표하기 기능 
	public void surveyClientUpdate(SubveyContentVO vo) {
		//System.out.println(vo.getSubtype()+":"+vo.getSubcode());
		int res = ss.update("survey.update1", vo);
		System.out.println("res:"+res);
	}
	
	public void surveyClientUpdate2(int subcode,String subtype) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("subcode", subcode);
		map.put("sutype", subtype);
		int res = ss.update("survey.update1", map);
		System.out.println("res:"+res);
	}
	
	
	
}
