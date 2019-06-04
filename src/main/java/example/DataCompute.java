package main.java.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataCompute {
	StudentGradeController studentgradecontroller=new StudentGradeController();
	
	
	public LinkedHashMap<String,String> computeVolunteer(LinkedHashMap<String,ArrayList<String>> volunteers,LinkedHashMap<String, Integer> grades,LinkedHashMap<String,Integer> allSchoolGrade,
			LinkedHashMap<String,Integer> allSchoolQuota){
		
		ArrayList<Map.Entry<String,Integer>> list=studentgradecontroller.theSort(grades);
		LinkedHashMap<String,String> studentResult=new LinkedHashMap<>();
		
		studentResult=studentgradecontroller.checkGrade(list, volunteers, grades, allSchoolGrade, allSchoolQuota);
		return studentResult;
	}
	public LinkedHashMap<String, String> computeRate(LinkedHashMap<String,ArrayList<String>> volunteers,LinkedHashMap<String, Integer> grades,LinkedHashMap<String,Integer> allSchoolGrade,
			LinkedHashMap<String,Integer> allSchoolQuota){
		DataCompute d=new DataCompute(); 
		
		LinkedHashMap<String,Integer> oldAllSchoolQuota=(LinkedHashMap<String, Integer>) allSchoolQuota.clone();
		
		d.computeVolunteer(volunteers,grades,allSchoolGrade,allSchoolQuota);
		LinkedHashMap<String,Integer> newAllSchoolQuota=allSchoolQuota;
		
		LinkedHashMap<String,String> rate=new LinkedHashMap<String,String>();
		 for (Object key1 : oldAllSchoolQuota.keySet()) {
	          
	            for(Object key2 : newAllSchoolQuota.keySet())
	            {
	            	if(key1==key2) {
	            		DecimalFormat df = new DecimalFormat("0.00%");
	            		String r=df.format((double)(oldAllSchoolQuota.get(key1)-newAllSchoolQuota.get(key2))/oldAllSchoolQuota.get(key1));
	            		rate.put((String) key1, r);
	            	}
	            }
		 }
		return rate;		
	}

}
