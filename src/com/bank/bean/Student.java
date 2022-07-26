/**
 * 
 */
package com.bank.bean;

/**
 * @author win 10
 *
 */
public class Student {

	private int student_id;
	
	public Student(int stu_id, String stu_name) {
		student_id=stu_id;
		student_name=stu_name;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	
	
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	private String student_name;
	private String student_username;
	private String student_password;
	private String student_email;
	

	

}
