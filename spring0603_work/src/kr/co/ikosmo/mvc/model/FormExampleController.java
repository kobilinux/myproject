package kr.co.ikosmo.mvc.model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ikosmo.mvc.vo.TBoardVO;

@Controller
public class FormExampleController {


	@RequestMapping(value="/form1")
	public String viewform1() {
		return "form1";
	}
	//submit누르고 파라미터를  받을 메서드 정의
	// request.getParameter("val1")을 스프링은 자동 관리 해준다.
	@RequestMapping(value = "/ins1",method = RequestMethod.POST)
	public ModelAndView ins1(String val1) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("val1"); // viewName
		StringBuffer sb = new StringBuffer();
		sb.append("<p style='color:pink'>");
		sb.append(val1);
		sb.append("</p>");
		mav.addObject("val1", sb.toString()); //전달 값 
		return mav;
	}
	// ins2 와 form2 추가
	@RequestMapping(value="/form2")
	public String viewform2() {
		return "form2";
	}
	// spring interceptor가 알아서 VO에 파라미터 값을 setter로 저장해준다.
	// @ModelAttribute("tvo") 를 사용하면 mav.addObject("tvo",vo); 동일하다.
	@RequestMapping(value = "/ins2",method = RequestMethod.POST)
	public ModelAndView ins2(@ModelAttribute("tvo") TBoardVO vo) {
		System.out.println("확인 :"+vo.getWriter());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("val2");
		//mav.addObject("tvo",vo);
		return mav;
	}
	
	@RequestMapping(value="/upform1")
	public String upform1() {
		return "upform1";
	}
	// 업로드 처리 
	//1. enctype="multipart/form-data"  => commons-fileupload.jar에 의해서 제공받은 클래스를 사용한다.
	//2. CommonsMultipartResolver 를 설정을 해야 한다. *******
	//3. 받아서 처리할 때는 MultipartFile 객체를 인자로 받아준다.
	//* => HttpServletRequest, HttpServletResponse등을 인자로 정의하면 스프링이 알아서 넣어준다.
	@RequestMapping(value="/upsave1", method = RequestMethod.POST)
	public ModelAndView save1(MultipartFile mfile, HttpServletRequest request) {
		//이미지가 저장될 절대 경로를 지정 
		ModelAndView mav = new ModelAndView("success");//view의 이름을 생성자의 인자값으로 지정 
		HttpSession session = request.getSession();
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println("Path :"+r_path);
		String img_path ="resources\\upload\\";
		System.out.println("imgPath :"+r_path);
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path);
		//이미지 이름을 연결 
		String oriFn = mfile.getOriginalFilename(); // 업로드 된 이미지 이름
		path.append(oriFn);
		System.out.println("FullPath :"+path);
		// 파일 업로드 실행 
		File f = new File(path.toString()); // 실제 이미지가 저장될 경로
		try {
			mfile.transferTo(f); // 스프링의 transferTo를 호출해서 이미지를 저장장소에 복사 
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mav.addObject("imgName",oriFn);
		return mav;
	}
	
	

}







