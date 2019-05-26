package main.java.example;
import java.util.*;
import java.util.Map.Entry;

public class StudentGradeController {
	public ArrayList<Entry<String, Integer>> theSort(Map<String, Integer> grades)
	{	
		Map<String, Integer> allStudentGrade=grades;
		ArrayList<Map.Entry<String,Integer>> arraylist=new ArrayList<>();
		arraylist.addAll(allStudentGrade.entrySet());
		StudentGradeController.ValueComparator vc=new ValueComparator();
		Collections.sort(arraylist,vc);
		return arraylist;
	}
	private static class ValueComparator implements Comparator<Map.Entry<String,Integer>>
	{
		public int compare(Map.Entry<String,Integer> m,Map.Entry<String,Integer> n)
		{
			return n.getValue()-m.getValue();
		}
	}
	public LinkedHashMap<String, String> checkGrade(ArrayList<Map.Entry<String,Integer>> list,LinkedHashMap<String,ArrayList<String>> Volunteers,
			LinkedHashMap<String, Integer> Grades,LinkedHashMap<String,Integer> AllSchoolGrade,LinkedHashMap<String, Integer> allSchoolQuota)
	{
		LinkedHashMap<String,String> StudentResult=new LinkedHashMap<String,String>();
		for(Iterator<Map.Entry<String,Integer>> it=list.iterator();it.hasNext();)
		{
			String iteratName=it.next().getKey();
			for(int i=0;i<Volunteers.values().size();i++) {//
				String school=Volunteers.get(iteratName).get(i);
				int SchoolGrade=AllSchoolGrade.get(school);
				 if(Grades.get(iteratName)>=SchoolGrade){//符合該學校的成績門檻
					  StudentResult.put(iteratName,school);
					  int oldQuota=allSchoolQuota.get(school);
					  int newQuota=allSchoolQuota.get(school)-1;
					  allSchoolQuota.replace(iteratName, oldQuota,newQuota);
					  break;
				  }
			}
		}
		return StudentResult;
	}
}
