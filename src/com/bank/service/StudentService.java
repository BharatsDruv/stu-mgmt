package com.bank.service;
import java.util.*;
import java.io.*;


import com.bank.bean.Student;

public class StudentService {
	CourseService  cs;
	
	public static ArrayList<Student> masterRegistry = new ArrayList<Student>();
	
	public void registerStudent() throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the new student's ID: ");
		int stu_id = Integer.parseInt(in.readLine());
		System.out.println("Enter the new student's Name: ");
		String name = in.readLine();

		Student newStudent = new Student(stu_id, name);
		masterRegistry.add(newStudent);
		System.out.println(masterRegistry.get(masterRegistry.size() - 1).getStudent_name());
		System.out.println("New student has been successfully added!");
		System.out.println(" ");
	}
	
	public void updateStudent()
	{
		
	}
	public void deleteStudent()
	{
		
	}
	public void registerToCourse() throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		cs=new CourseService();
		
		
		System.out.println("Enter the course name: ");
		String courseName = in.readLine();
		System.out.println("Enter the course ID: ");
		int courseID = Integer.parseInt(in.readLine());
		System.out.println("Enter your id: ");
		int stuID = Integer.parseInt(in.readLine());
		System.out.println("Enter the your name: ");
		String name = in.readLine();

		for (int i = 0; i < cs.courseList.size(); i++) {
			if (cs.courseList.get(i).getCourse_name() == courseName && cs.courseList.get(i).getCourse_id() == courseID) {
				Student student = new Student(stuID, name);
				System.out.println("You have been successfully added to the course!");
			}
		}
	}
	
	public void withdrawFromCourse() throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter the course name: ");
			String courseName = in.readLine();
			System.out.println("Enter the course ID: ");
			int courseID = Integer.parseInt(in.readLine());
			System.out.println("Enter your id: ");
			int stuID = Integer.parseInt(in.readLine());
			System.out.println("Enter the your name: ");
			String name = in.readLine();

		for (int i = 0; i < cs.courseList.size(); i++) {
			if (cs.courseList.get(i).getCourse_name() == courseName) {
				Student student = new Student(stuID, name);
				System.out.println("You have been successfully removed from the course!");
			}
		}
	}
	
}
