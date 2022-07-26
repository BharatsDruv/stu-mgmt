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
		int f=0;
		do {
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
										m.getStudent_gradsheet().put(course.getCourse_name(), "NA");
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
										m.getStudent_gradsheet().remove(course.getCourse_name());
										System.out.println("Course has been removed successfully.");
										m.yourCourses();
										break;
									}
								}
								break;
							case 3:
								System.out.println("Your Grads are:");
								HashMap<String, String > hm=m.getStudent_gradsheet();
								for (Map.Entry<String,String> entry : hm.entrySet()) 
						            System.out.println("Course :" + entry.getKey() +
						                             ", Grad :" + entry.getValue());
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
				
				System.out.println("Registraion Enter\n");
				ss.registerStudent();
				
				break;
			case 3:
				break;
			case 4:
				f=1;
				System.out.println("Thanks for visiting.");
				break;
		
			default:
					System.out.println("Enter valid option.");
		}
	}while(f==0);
		//all other method calls
	}
}
