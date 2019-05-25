package main.java.example;
import java.util.*;
import java.util.Map.Entry;

public class StudentGradeController {
	public ArrayList<Entry<String, Integer>> Sort(HashMap<String, Integer> Grades)
	{	
		HashMap<String, Integer> AllStudentGrade=Grades;
		ArrayList<Map.Entry<String,Integer>> list=new ArrayList<>();
		list.addAll(AllStudentGrade.entrySet());
		StudentGradeController.ValueComparator vc=new ValueComparator();
		Collections.sort(list,vc);
		return list;
//		for(Iterator<Map.Entry<String,Integer>> it=list.iterator();it.hasNext();)
//		{
//			System.out.println(it.next());
//		}
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
