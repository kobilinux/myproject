package or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WorkController {

	@RequestMapping("/val")
	public String test() {
		return "test";
	}
}