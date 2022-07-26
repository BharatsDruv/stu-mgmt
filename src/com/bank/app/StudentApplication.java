package com.bank.app;

import com.bank.bean.Course;
import com.bank.bean.Student;
import com.bank.service.CourseService;
import com.bank.service.StudentService;

import java.io.IOException;
import java.util.*
;
public class StudentApplication {

	public static void main(String[] ar) throws IOException
	{
		
		Scanner in=new Scanner(System.in);
		int choice =0;
		StudentService ss=new StudentService();
		System.out.println("Course Registration System\n Select\n"+
		"1. Login\n"
		+"2. Register\n"
		+"3. Update Password\n"
		+"4. Exit");
		choice = in.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter "+
						"Username:");
				
				String username=in.next();
				System.out.println("Enter "+
						"Password:");
				String password=in.next();
				System.out.println("Select "+
						"Role\n"+
						"1. Student\n"+
						"2. Professor\n"+
						"3. Admin");
				int role=Integer.parseInt(in.next());
				if(role==1)
				{
					
					int found=0;
					for(Student m: ss.masterRegistry)
					{
//						System.out.println(m.getStudent_name());
						if(m.getStudent_username().equals(username) && m.getStudent_password().equals(password))
						{
							found=1;
							//show menu
							/*
							 * display the menu of student
								1. Add course
								2. Drop course
								3. View Grads
								4. Pay Fee
							 */
							System.out.println("Welcome "+ m.getStudent_name());
							System.out.println("Select\n"+
							"1. Add course\n"
							+"2. Drop course\n"
							+"3. View Grads\n"
							+"4. Pay Fee\n");
							
							int menu_choice=in.nextInt();
							CourseService cs=new CourseService();
							switch(menu_choice)
							{
							case 1: 
								m.yourCourses();
								
								cs.viewAvailableCourses();
								System.out.println("Enter Course Id:");
								int course_choice=in.nextInt();
								for(Course course: cs.courseList)
								{
									if(course_choice==course.getCourse_id())
									{
										m.getStudent_courses().add(course);
										System.out.println("Course has been added successfully.");
										m.yourCourses();
										break;
									}
								}
								break;
							case 2:
								m.yourCourses();
							
								System.out.println("Enter Course Id to be removed:");
								course_choice=in.nextInt();
								for(Course course: m.getStudent_courses())
								{
									if(course_choice==course.getCourse_id())
									{
										m.getStudent_courses().remove(course);
										System.out.println("Course has been removed successfully.");
										m.yourCourses();
										break;
									}
								}
								break;
							case 3:
								break;
							case 4:
								break;
							
							}
							break;
						}
						
					}
					if(found==0)
						System.out.println("No user exist.");
				}
				
				break;
				
			case 2:
				
				System.out.println("Professor\n Select\n"+
						"1. Add Course\n"
						+"2. Delete Course\n"
						+"");
				
				int cc1=in.nextInt();
				CourseService cs=new CourseService();
				if(cc1==1)
					cs.createCourse();
				else if(cc1==2)
					cs.deleteCourse();
				
				break;
			case 3:
				break;
			case 4:
				break;
		
			default:
					System.out.println("Enter valid option.");
		}
		//all other method calls
	}
}
