package com.bank.service;

import java.util.*;
import java.io.*;

import com.bank.bean.Student;
import com.bank.exception.RegistrationAlreadyExist;

public class StudentService {
	CourseService cs;

	public static ArrayList<Student> masterRegistry = new ArrayList<Student>();

	public StudentService() {
		masterRegistry.add(new Student(1, "Jaimin", "jaimindb", "1234"));
		masterRegistry.add(new Student(2, "Akshat", "akshatdb", "1234"));
		masterRegistry.add(new Student(3, "Chirayu", "chirayudb", "1234"));
	}

	void displayStudents() {
		System.out.println("Student directory");

		for (Student s : masterRegistry) {
			System.out.println("Student:" + s.getStudent_name());
		}
	}

	public void registerStudent() throws IOException, RegistrationAlreadyExist {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the new student's ID: ");
		int stu_id = Integer.parseInt(in.readLine());
		System.out.println("Enter the new student's Name: ");
		String name = in.readLine();

		Student newStudent = new Student(stu_id, name, name + "db", "1234");
		try {
			if (masterRegistry.indexOf(newStudent) != -1) {
				throw new RegistrationAlreadyExist(name);
			}
		} catch (RegistrationAlreadyExist e) {
			System.out.println("User Already exist." + e.getUsername());
		} catch (Exception e) {

			masterRegistry.add(newStudent);
			System.out.println(masterRegistry.get(masterRegistry.size() - 1).getStudent_name());
			System.out.println("New student has been successfully added!");
			System.out.println(" ");
			displayStudents();
		}
	}

	public void updateStudent() {

	}

	public void deleteStudent() throws NumberFormatException, IOException {
		System.out.println("To Remove Student");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the student's ID: ");
		int stu_id = Integer.parseInt(in.readLine());
		int f = 0;
		for (Student s : masterRegistry) {
			if (s.getStudent_id() == stu_id) {
				masterRegistry.remove(s);
				System.out.println(stu_id + " Successfully removed");
				displayStudents();
				f = 1;
				break;
			}
		}
		if (f == 0)
			System.out.println("No student found with id: " + stu_id);

	}

	public void registerToCourse() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		cs = new CourseService();

		System.out.println("Enter the course name: ");
		String courseName = in.readLine();
		System.out.println("Enter the course ID: ");
		int courseID = Integer.parseInt(in.readLine());
		System.out.println("Enter your id: ");
		int stuID = Integer.parseInt(in.readLine());
		System.out.println("Enter the your name: ");
		String name = in.readLine();

		for (int i = 0; i < cs.courseList.size(); i++) {
			if (cs.courseList.get(i).getCourse_name() == courseName
					&& cs.courseList.get(i).getCourse_id() == courseID) {
				// Student student = new Student(stuID, name);
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
				// Student student = new Student(stuID, name);
				System.out.println("You have been successfully removed from the course!");
			}
		}
	}

}
