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
	public void setSchoolGrade(String name)
	{
		if(name=="台大") {
			schoolGrade=73;
		}
		else if(name=="清大") {
			schoolGrade=72;
		}
		else if(name=="交大") {
			schoolGrade=71;
		}
		else if(name=="成大") {
			schoolGrade=70;
		}
		else if(name=="中央") {
			schoolGrade=68;
		}
		else if(name=="中興") {
			schoolGrade=67;
		}
		else if(name=="中正") {
			schoolGrade=65;
		}
		else if(name=="中山") {
			schoolGrade=65;
		}
		else if(name=="輔大") {
			schoolGrade=58;
		}
		else if(name=="逢甲") {
			schoolGrade=55;
		}
		else if(name=="中原") {
			schoolGrade=53;
		}
		schoolGradeData.put(name, schoolGrade);
	}
	public LinkedHashMap<String,Integer> getSchoolGradeData()
	{
		return schoolGradeData;
	}
}
