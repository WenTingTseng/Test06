package main.java.example;

import java.util.*;


public class Main {
	
	
	public static void main() {


		String[] allName= {"Wendy","Tony","Jeff"};
		int[] allGrades= {74,70,68};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] schoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] quota= {5,8,4,4,3,3,6};
		int[] schoolGrades= {73,70,68,67,65,65,55};

		DataController c=new DataController();
		LinkedHashMap<String, Integer> grades=c.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=c.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=c.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=c.getAllSchoolGrade(schoolName,schoolGrades);
		int choice;
		DataCompute d=new DataCompute();
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入慾服務的選項:(1)查看榜單結果:");
		choice=scanner.nextInt();
		switch(choice){
			case 1:
				d.ComputeVolunteer(volunteers,grades,allSchoolGrade,allSchoolQuota);
				break;
				
			case 5:
				System.out.println("結束!");
				break;
			
		}		
	}
}
