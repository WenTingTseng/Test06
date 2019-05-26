package main.java.example;


import java.util.LinkedHashMap;

public class School {
	String schoolName;
	int quota;
	int schoolGrade;
	
	LinkedHashMap<String, Integer> schoolQutoa= new LinkedHashMap<>();
	LinkedHashMap<String, Integer> schoolGradeData= new LinkedHashMap<>();
	public void setSchoolQuota(String schoolName,int quota)
	{
		schoolQutoa.put(schoolName, quota);
	}
	public LinkedHashMap<String, Integer> getSchoolQuota()
	{
		return schoolQutoa;
	}
	public void setSchoolGrade(String name,int schoolGrade)
	{
		schoolGradeData.put(name, schoolGrade);
	}
	public LinkedHashMap<String,Integer> getSchoolGradeData()
	{
		return schoolGradeData;
	}
}
