package main.java.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class Student {
	String Name;int Grade;
	LinkedHashMap<String, Integer> StudentGrade = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, ArrayList<String>> StudentVolunteer = new LinkedHashMap<String,ArrayList<String>>();
//	String[][] StudentVolunteer=new String[100][];
	public void setStudentData(String Name,int Grade)
	{
		StudentGrade.put(Name, Grade);
	}
	public LinkedHashMap<String, Integer> getStudentData()
	{
		return StudentGrade;
	}
	public void setStudentVolunteer(String allName,ArrayList<String> Schools)
	{
		StudentVolunteer.put(allName, Schools);
	}
	public LinkedHashMap<String,ArrayList<String>> getStudentVolunteer()
	{
		return StudentVolunteer;
	}
	
}
