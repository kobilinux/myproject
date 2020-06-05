package kr.co.ikosmo.mvc.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class TestJsonController {
	@Autowired
	private View JsonView;
	
	@RequestMapping(value="/testJson")
	public View testJson1(String command,String name, ModelMap map){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("JsonView");
		ArrayList<String> list = new ArrayList<>();
		list.add(command);
		list.add(name);
		list.add("test");
		map.addAttribute("menu", list);
		return JsonView;
	}
	
}
