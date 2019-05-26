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
			ArrayList<String> Schools=new ArrayList<String>();
			for(int j=0;j<school[i].length;j++)
			{
				Schools.add(school[i][j]);
			}
			allStudent.setStudentVolunteer(allName[i],Schools);
		}
		
		return allStudent.getStudentVolunteer();
	}
	public LinkedHashMap<String, Integer> getAllSchoolQuota(String[] SchoolName,int[] Quota)
	{
		for(int i=0;i<SchoolName.length;i++)
		{
			allSchool.setSchoolQuota(SchoolName[i],Quota[i]);
		}
		return allSchool.getSchoolQuota();
	}
	public LinkedHashMap<String,Integer> getAllSchoolGrade(String[] SchoolName,int[] SchoolGrades)
	{
		for(int i=0;i<SchoolName.length;i++)
		{

			allSchool.setSchoolGrade(SchoolName[i],SchoolGrades[i]);
		}
		return allSchool.getSchoolGradeData();
	}
}
