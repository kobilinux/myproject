package kr.co.ikosmo.mvc.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class C3ChartController {

	@RequestMapping(value="/chart1")
	public String chartDefault1() {
		return "chart/chart1";
	}
	@RequestMapping(value="/chart2")
	public String chartDefault2() {
		return "chart/chart2";
	}
	@RequestMapping(value="/chart3")
	public String chartDefault3() {
		return "chart/piechart";
	}
}
