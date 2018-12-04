package or.kosta.mvc.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyChatController {

	    @RequestMapping(value={"/chat","/"})
	    public String viewChattingPage() {
	        return "index2";
	    }
	    @RequestMapping("/test")
	    public String message() {
	    	return "test";
	    }
}
