package main.java.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import main.java.example.Student;

public class DataController {

	Student allStudent=new Student();
	School  allSchool=new School();
	public LinkedHashMap<String, Integer> getAllStudentGrade(String[] allName,int[] allGrades)
	{
		for(int i=0;i<allName.length;i++)
		{
			allStudent.setStudentData(allName[i],allGrades[i]);
		}
		
		return allStudent.getStudentData();
	}
	public LinkedHashMap<String,ArrayList<String>> getAllStudentVolunteer(String[] allName,String[][] school)
	{
		for(int i=0;i<allName.length;i++)
		{
			ArrayList<String> schools=new ArrayList<>();
			for(int j=0;j<school[i].length;j++)
			{
				schools.add(school[i][j]);
			}
			allStudent.setStudentVolunteer(allName[i],schools);
		}
		
		return allStudent.getStudentVolunteer();
	}
	public LinkedHashMap<String, Integer> getAllSchoolQuota(String[] schoolName,int[] quota)
	{
		for(int i=0;i<schoolName.length;i++)
		{
			allSchool.setSchoolQuota(schoolName[i],quota[i]);
		}
		return allSchool.getSchoolQuota();
	}
	public LinkedHashMap<String,Integer> getAllSchoolGrade(String[] schoolName,int[] schoolGrades)
	{
		for(int i=0;i<schoolName.length;i++)
		{

			allSchool.setSchoolGrade(schoolName[i],schoolGrades[i]);
		}
		return allSchool.getSchoolGradeData();
	}
}