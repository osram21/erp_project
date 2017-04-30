package kr.or.dgit.erp_project.dto;

import java.util.ArrayList;
import java.util.Date;

public class Emplyoee {
	private String no;
	private String name;
	private Title title;
	private int salary;
	private boolean gender;
	private ArrayList<String> hobbys;
	private Department department;
	private Date joinDate;
	
	public Emplyoee() {}

	public Emplyoee(String no, String name, Title title, int salary, boolean gender, ArrayList<String> hobbys,
			Department department, Date joinDate) {
		this.no = no;
		this.name = name;
		this.title = title;
		this.salary = salary;
		this.gender = gender;
		this.hobbys = hobbys;
		this.department = department;
		this.joinDate = joinDate;
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

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return String.format("Employee [no=%s, name=%s, title=%s, salary=%s, gender=%s, hobbys=%s, department=%s, joinDate=%s]",
				no, name, title, salary, gender, hobbys, department, joinDate);
				
	}
	
	
}
