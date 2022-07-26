package com.bank.exception;

public class CourseNotFound extends Exception
{
	int course_id;
	
	public CourseNotFound(int course_id)
	{
		this.course_id=course_id;
	}
	public int getCourse()
	{
		return course_id;
	}
}
