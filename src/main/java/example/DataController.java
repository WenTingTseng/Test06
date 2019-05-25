package main.java.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import main.java.example.Student;

public class DataController {

	Student AllStudent=new Student();
	School  AllSchool=new School();
	public LinkedHashMap<String, Integer> getAllStudentGrade(String[] AllName,int[] AllGrades)
	{
		for(int i=0;i<AllName.length;i++)
		{
			AllStudent.setStudentData(AllName[i],AllGrades[i]);
		}
		
		return AllStudent.getStudentData();
	}
	public LinkedHashMap<String,ArrayList<String>> getAllStudentVolunteer(String[] AllName,String[][] school)
	{
		for(int i=0;i<AllName.length;i++)
		{
			ArrayList<String> Schools=new ArrayList<String>();
			for(int j=0;j<school[i].length;j++)
			{
				Schools.add(school[i][j]);
			}
			AllStudent.setStudentVolunteer(AllName[i],Schools);
		}
		
		return AllStudent.getStudentVolunteer();
	}
	public LinkedHashMap<String, Integer> getAllSchoolQuota(String[] SchoolName,int[] Quota)
	{
		for(int i=0;i<SchoolName.length;i++)
		{
			AllSchool.setSchoolQuota(SchoolName[i],Quota[i]);
		}
		return AllSchool.getSchoolQuota();
	}
	public LinkedHashMap<String,Integer> getAllSchoolGrade(String[] SchoolName,int[] SchoolGrades)
	{
		for(int i=0;i<SchoolName.length;i++)
		{

			AllSchool.setSchoolGrade(SchoolName[i],SchoolGrades[i]);
		}
		return AllSchool.getSchoolGradeData();
	}
}
