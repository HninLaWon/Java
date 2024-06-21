package com.jdc.app.model;
import java.util.Scanner;

public class StudentRegisterationController{
	private Scanner scanner;

	private StudentRegistry registry;

	public StudentRegisterationController(){
		scanner = new Scanner(System.in);
		registry = StudentRegistry.getRegistry();
	}
	
	public void addNewStudent(){
		//show message to entr student name
		System.out.println("Please enter Student's name : ");
		//get user input
		String name = scanner.nextLine();
		//add to student registry
		registry.addNew(name);


	}
}