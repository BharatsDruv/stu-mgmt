package com.bank.service;
import java.util.*;

import com.bank.bean.Course;

import java.io.*;


public class CourseService {
	
	public static ArrayList<Course> courseList=new ArrayList<>();
	public void viewAvailableCourses() {
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(courseList.get(i).getCourse_name());
		}
	}

	public void createCourse() throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the course name: ");
		String courseName = in.readLine();

		System.out.println("Enter the course ID: ");
		int courseID = Integer.parseInt(in.readLine());

		System.out.println("the maximum number of students that can register: 10");
		int mS = 10;

		System.out.println("Enter the current number of students that are registered: ");
		String cS = in.readLine();
		int currentStudents = Integer.parseInt(cS);

		System.out.println("Enter the instructor's name: ");
		String instructorName = in.readLine();


		Course c = new Course(courseID, courseName);
		courseList.add(c);

		System.out.println("The new course " + courseName + " has been successfully added!");
	}

	public void editCourse()
	{
		
	}
	public void deleteCourse() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the course name to be deleted: ");
		String courseName = in.readLine();

		for (int i = 0; i < courseList.size(); i++) {
			String j = courseList.get(i).getCourse_name();

			
			if (j.contentEquals(courseName)) {
				courseList.remove(i);
				System.out.println("The course " + courseName + " has been successfully removed!");
				System.out.println(" ");
				break;
			} else if ((!j.contentEquals(courseName)) && (i == courseList.size() - 1)) {
				System.out.println("Oops! We are unable to find that course, let's try again!");
			}
		}
	}
	public void updateCourse()
	{
		
	}
	public void saveCourse()
	{
		
	}
	
	
}
