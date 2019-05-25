package main.java.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataCompute {
	StudentGradeController S=new StudentGradeController();
	
	
	public LinkedHashMap<String,String> ComputeVolunteer(LinkedHashMap<String,ArrayList<String>> Volunteers,LinkedHashMap<String, Integer> Grades,LinkedHashMap<String,Integer> AllSchoolGrade,
			LinkedHashMap<String,Integer> AllSchoolQuota){
		
		ArrayList<Map.Entry<String,Integer>> list=S.Sort(Grades);
		LinkedHashMap<String,String> StudentResult=new LinkedHashMap<String,String>();
		
		StudentResult=S.checkGrade(list, Volunteers, Grades, AllSchoolGrade, AllSchoolQuota);
		return StudentResult;
	
	}

}
