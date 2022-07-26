/**
 * 
 */
package com.bank.bean;
import java.util.*;

/**
 * @author win 10
 *
 */
public class Student {

	private int student_id;
	private String student_name;
	private String student_username;
	private String student_password;
	private String student_email;
	private ArrayList<Course> student_courses;
	private HashMap<String,String> student_gradsheet;
	private int student_fees=0;
	

	public int getStudent_fees() {
		return student_fees;
	}

	public void setStudent_fees(int student_fees) {
		this.student_fees = student_fees;
	}

	public Student(int stu_id, String stu_name, String username, String password) {
		student_id=stu_id;
		student_name=stu_name;
		student_username=username;
		student_password=password;
		student_courses=new ArrayList<>();
		student_courses.add(new Course(105,"CS5"));
		student_gradsheet=new HashMap<>();
		student_gradsheet.put("CS5", "NA");
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
	
	public ArrayList<Course> getStudent_courses() {
		return student_courses;
	}

	public void setStudent_courses(ArrayList<Course> student_courses) {
		this.student_courses = student_courses;
	}
	public HashMap<String, String> getStudent_gradsheet() {
		return student_gradsheet;
	}

	public void setStudent_gradsheet(HashMap<String, String> student_gradsheet) {
		this.student_gradsheet = student_gradsheet;
	}
	
	public void yourCourses()
	{
		System.out.println("Your Courses:\n");
		for(Course stu_course: student_courses)
		{
			System.out.println(stu_course.getCourse_id()+":"+stu_course.getCourse_name());
		}
	}

	

}
