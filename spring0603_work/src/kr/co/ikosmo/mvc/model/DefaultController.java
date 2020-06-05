package kr.co.ikosmo.mvc.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//@Controller 어노테이션의 역할은 scanning 대상이 모델로 등록되도록 설정한다.
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DefaultController {
	// value {} 여러개를 설정 
	@RequestMapping(value= {"/","/index"})
	public String indexPage() {
		// 값을 넘길 필요가 없을 때 String 반환형은 viewName
		return "main/index";
	}
	
	
	
	
	
	
	
	
	
	
	
	// 해당 모델이 응답할 HandlerMapping 이다.
	// 요청값, 요청방식 
	@RequestMapping(value="/myhello",method = RequestMethod.GET)
	public ModelAndView hello() {
		//ActionForward + requestScope 합친 개념 , forward를 기본값 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); // 뷰의 이름을 전달 
		mav.addObject("msg","안녕하세요 나의 첫 스프링 MVC입니다."); // request값
		return mav;
	}
}
