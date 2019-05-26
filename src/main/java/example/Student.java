package main.java.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Student {
	String name;
	int grade;
	LinkedHashMap<String, Integer> studentGrade = new LinkedHashMap<>();
	LinkedHashMap<String, ArrayList<String>> studentVolunteer = new LinkedHashMap<>();
	public void setStudentData(String name,int grade)
	{
		studentGrade.put(name, grade);
	}
	public LinkedHashMap<String, Integer> getStudentData()
	{
		return studentGrade;
	}
	public void setStudentVolunteer(String allName,ArrayList<String> schools)
	{
		studentVolunteer.put(allName, schools);
	}
	public LinkedHashMap<String,ArrayList<String>> getStudentVolunteer()
	{
		return studentVolunteer;
	}	
}
