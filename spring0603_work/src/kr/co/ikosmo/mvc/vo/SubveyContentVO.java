package kr.co.ikosmo.mvc.vo;

public class SubveyContentVO {
	private String surveytype;
	private int subcode;
	private String surveytitle;
	private int surveycnt;

	

	public String getSurveytype() {
		return surveytype;
	}
	public void setSurveytype(String surveytype) {
		this.surveytype = surveytype;
	}
	public int getSubcode() {
		return subcode;
	}
	public void setSubcode(int subcode) {
		this.subcode = subcode;
	}

	public String getSurveytitle() {
		return surveytitle;
	}
	public void setSurveytitle(String surveytitle) {
		this.surveytitle = surveytitle;
	}
	public int getSurveycnt() {
		return surveycnt;
	}
	public void setSurveycnt(int surveycnt) {
		this.surveycnt = surveycnt;
	}
	
}
