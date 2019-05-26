package main.java.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataCompute {
	StudentGradeController studentgradecontroller=new StudentGradeController();
	
	
	public LinkedHashMap<String,String> ComputeVolunteer(LinkedHashMap<String,ArrayList<String>> volunteers,LinkedHashMap<String, Integer> grades,LinkedHashMap<String,Integer> allSchoolGrade,
			LinkedHashMap<String,Integer> allSchoolQuota){
		
		ArrayList<Map.Entry<String,Integer>> list=studentgradecontroller.theSort(grades);
		LinkedHashMap<String,String> studentResult=new LinkedHashMap<String,String>();
		
		studentResult=studentgradecontroller.checkGrade(list, volunteers, grades, allSchoolGrade, allSchoolQuota);
		return studentResult;
	}

}
