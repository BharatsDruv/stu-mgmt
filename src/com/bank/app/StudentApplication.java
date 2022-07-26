package com.bank.app;

import com.bank.bean.Student;
import com.bank.service.StudentService;
import java.util.*
;
public class StudentApplication {

	public static void main(String[] ar)
	{
		StudentService student1=new StudentService();
		student1.createStudent();
		Scanner in=new Scanner(System.in);
		int choice =0;
		do {
		System.out.println("Course Registration System\n Select\n"+
		"1. Login as Student\n"
		+"2. Login as Professor");
		choice = in.nextInt();
		switch(choice)
		{
			case 1:
				break;
			case 2:
				break;
			default:
					System.out.println("Enter valid option.");
		}
		}while(choice!=1 && choice !=2);
		//all other method calls
	}
}
