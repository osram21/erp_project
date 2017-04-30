package kr.or.dgit.erp_project.dto;

public class Department {
	private String no;
	private String name;
	private int floor;
	
	public Department() {}

	public Department(String no) {
		this.no = no;
	}

	public Department(String no, String name, int floor) {
		this.no = no;
		this.name = name;
		this.floor = floor;
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

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", name, no);
	}
	//테이블
	
}
