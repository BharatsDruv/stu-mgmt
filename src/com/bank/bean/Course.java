package com.bank.bean;

public class Course {

	Course(int id, String name)
	{
		course_id=id;
		course_name=name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getCourse_student_id() {
		return course_student_id;
	}
	public void setCourse_student_id(int course_student_id) {
		this.course_student_id = course_student_id;
	}
	public int getCourse_registration() {
		return course_registration;
	}
	public void setCourse_registration(int course_registration) {
		this.course_registration = course_registration;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	public int getCourse_year() {
		return course_year;
	}
	public void setCourse_year(int course_year) {
		this.course_year = course_year;
	}
	public String getCourse_desc() {
		return course_desc;
	}
	public void setCourse_desc(String course_desc) {
		this.course_desc = course_desc;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	private int course_id;
	private int course_student_id;
	private int course_registration;
	private String course_type;
	private int course_year;
	private String course_desc;
	private String course_name;

	
}
