package com.bank.app;

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
		do {
		System.out.println("Course Registration System\n Select\n"+
		"1. Student\n"
		+"2. Professor");
		choice = in.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Student\n Select\n"+
						"1. Add Student\n"
						
						+"2. Register to Course\n"
						+"3. Delete Student");
				
				int cc=in.nextInt();
				StudentService ss=new StudentService();
				if(cc==1)
					ss.registerStudent();
				else if(cc==2)
					ss.registerToCourse();
				else if(cc==3)
					ss.deleteStudent();
				break;
				
			case 2:
				
				System.out.println("Professor\n Select\n"+
						"1. Add Course\n"
						+"2. Delete Course\n"
						+"");
				
				cc=in.nextInt();
				CourseService cs=new CourseService();
				if(cc==1)
					cs.createCourse();
				else if(cc==2)
					cs.deleteCourse();
				
				break;
			default:
					System.out.println("Enter valid option.");
		}
		}while(choice!=1 && choice !=2);
		//all other method calls
	}
}
