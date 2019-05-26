package main.java.example;
import java.util.*;
import java.util.Map.Entry;

public class StudentGradeController {
	public ArrayList<Entry<String, Integer>> theSort(Map<String, Integer> grades)
	{	
		Map<String, Integer> allStudentGrade=grades;
		ArrayList<Map.Entry<String,Integer>> list=new ArrayList<>();
		list.addAll(allStudentGrade.entrySet());
		StudentGradeController.ValueComparator vc=new ValueComparator();
		Collections.sort(list,vc);
		return list;
	}
	private static class ValueComparator implements Comparator<Map.Entry<String,Integer>>
	{
		public int compare(Map.Entry<String,Integer> m,Map.Entry<String,Integer> n)
		{
			return n.getValue()-m.getValue();
		}
	}
	public LinkedHashMap<String, String> checkGrade(ArrayList<Map.Entry<String,Integer>> list,LinkedHashMap<String,ArrayList<String>> volunteers,
			LinkedHashMap<String, Integer> grades,LinkedHashMap<String,Integer> allSchoolGrade,LinkedHashMap<String, Integer> allSchoolQuota)
	{
		LinkedHashMap<String,String> studentResult=new LinkedHashMap<>();
		for(Iterator<Map.Entry<String,Integer>> it=list.iterator();it.hasNext();)
		{
			String iteratName=it.next().getKey();
			for(int i=0;i<volunteers.values().size();i++) {//
				String school=volunteers.get(iteratName).get(i);
				int schoolGrade=allSchoolGrade.get(school);
				 if(grades.get(iteratName)>=schoolGrade){//符合該學校的成績門檻
					  studentResult.put(iteratName,school);
					  int oldQuota=allSchoolQuota.get(school);
					  int newQuota=allSchoolQuota.get(school)-1;
					  allSchoolQuota.replace(iteratName, oldQuota,newQuota);
					  break;
				  }
			}
		}
		return studentResult;
	}
}
