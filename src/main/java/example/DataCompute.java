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
		
		LinkedHashMap<String,Integer> OldAllSchoolQuota=(LinkedHashMap<String, Integer>) allSchoolQuota.clone();
		
		d.computeVolunteer(volunteers,grades,allSchoolGrade,allSchoolQuota);
		LinkedHashMap<String,Integer> NewAllSchoolQuota=allSchoolQuota;
		
		LinkedHashMap<String,String> Rate=new LinkedHashMap<String,String>();
		 for (Object key1 : OldAllSchoolQuota.keySet()) {
	            //System.out.println(key1 + " : " + OldAllSchoolQuota.get(key1));
	            for(Object key2 : NewAllSchoolQuota.keySet())
	            {
	            	if(key1==key2) {
	            		DecimalFormat df = new DecimalFormat("0.00%");
	            		String rate=df.format((double)(OldAllSchoolQuota.get(key1)-NewAllSchoolQuota.get(key2))/OldAllSchoolQuota.get(key1));
	            		Rate.put((String) key1, rate);
	            	}
	            }
		 }
		return Rate;		
	}

}
