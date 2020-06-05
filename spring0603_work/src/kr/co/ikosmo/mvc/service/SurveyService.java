package kr.co.ikosmo.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ikosmo.mvc.dao.SurveyDao;
import kr.co.ikosmo.mvc.vo.SubveyContentVO;
import kr.co.ikosmo.mvc.vo.SubveyView2VO;
import kr.co.ikosmo.mvc.vo.SurveyVO;
@Service
//트랜젝션 처리를 실행해주는 어노테이
@Transactional
public class SurveyService {
	@Autowired
	private SurveyDao surveyDao;
	
	
	public void addSurvey(SurveyVO vo,List<SubveyContentVO> list) {
		surveyDao.addSurvey(vo);
		surveyDao.addSurveyContent(list);
	}
	
}
