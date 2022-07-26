package com.bank.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bank.bean.Professor;
import com.bank.bean.Student;

public class ProfessorService {
	
		public void addProfessor() throws NumberFormatException, IOException
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the new Professor's ID: ");
			int stu_id = Integer.parseInt(in.readLine());
			System.out.println("Enter the new Professor's Name: ");
			String name = in.readLine();

		}
		public void editProfessor()
		{
			
		}
		public void deleteProfessor()
		{
			
		}
		public void updateProfessor()
		{
			
		}
		public void saveProfessor()
		{
			
		}
	
}
