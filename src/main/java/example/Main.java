package main.java.example;

import java.util.*;


public class Main {
	
	
	public static void main() {
		// TODO Auto-generated method stub

		String[] AllName= {"Wendy","Tony","Jeff"};
		int[] AllGrades= {74,70,68};
		String[][] AllVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] SchoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] Quota= {5,8,4,4,3,3,6};
		int[] SchoolGrades= {73,70,68,67,65,65,55};

		DataController C=new DataController();
		LinkedHashMap<String, Integer> Grades=C.getAllStudentGrade(AllName,AllGrades);
		LinkedHashMap<String,ArrayList<String>> Volunteers=C.getAllStudentVolunteer(AllName,AllVolunteer);
		LinkedHashMap<String,Integer> AllSchoolQuota=C.getAllSchoolQuota(SchoolName,Quota);
		LinkedHashMap<String,Integer> AllSchoolGrade=C.getAllSchoolGrade(SchoolName,SchoolGrades);
		int choice;
		DataCompute d=new DataCompute();
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入慾服務的選項:(1)查看榜單結果:");
		choice=scanner.nextInt();
		switch(choice){
			case 1:
				d.ComputeVolunteer(Volunteers,Grades,AllSchoolGrade,AllSchoolQuota);
				break;
				
			case 5:
				System.out.println("結束!");
				break;
			
		}		
	}
}
