package kr.or.dgit.erp_project.dto;

public class Title {
	private String no;
	private String name;
	
	public Title() {}

	public Title(String no) {
		this.no = no;
	}

	public Title(String no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", name, no);
	}
	
	//테이블
}
