package main.java.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class School {
	String SchoolName;int Quota;int SchoolGrade;
	
	LinkedHashMap<String, Integer> SchoolQutoa= new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Integer> SchoolGradeData= new LinkedHashMap<String, Integer>();
	public void setSchoolQuota(String SchoolName,int Quota)
	{
		SchoolQutoa.put(SchoolName, Quota);
	}
	public LinkedHashMap<String, Integer> getSchoolQuota()
	{
		return SchoolQutoa;
	}
	public void setSchoolGrade(String Name,int SchoolGrade)
	{
		SchoolGradeData.put(Name, SchoolGrade);
	}
	public LinkedHashMap<String,Integer> getSchoolGradeData()
	{
		return SchoolGradeData;
	}
}
