/**
 * 
 */
package com.bank.dao;

/**
 * @author win 10
 *
 */
public interface StudentDao 
{
	/*
	 * Add course
	 * and all operations
	 */
	public boolean verifyUser(String username, String password);
	
	public boolean addCourse();
}
