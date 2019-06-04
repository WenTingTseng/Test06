package main.java.example;


import java.util.*;


public class Main {
	
	
	public static void main() {

		String[] allName= {"王曉明","曾筱婷","甘柔","周湯豪","韓國瑜","李秉乾"};
		int[] allGrades= {74,70,68,73,53,71};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"},{"中正","逢甲","輔大"},{"輔大","逢甲","中原"},{"清大","交大","成大"}};
		String[] schoolName= {"台大","交大","清大","成大","中央","中興","中正","中山","逢甲","輔大","中原"};
		int[] quota= {5,5,3,8,4,4,3,3,6,6,5};
		
		DataController c=new DataController();
		LinkedHashMap<String, Integer> grades=c.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=c.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=c.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=c.getAllSchoolGrade(schoolName);
		int choice;
		DataCompute d=new DataCompute();
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入服務的選項:(1)查看榜單結果(2)查看各校錄取率");
		choice=scanner.nextInt();
		switch(choice){
		case 1:
			System.out.println(d.ComputeVolunteer(volunteers,grades,allSchoolGrade,allSchoolQuota));
			break;
		case 2:
			System.out.println(d.ComputeRate(volunteers,grades,allSchoolGrade,allSchoolQuota));
			break;
		case 5:
			System.out.println("結束!");
			break;
		}		
		
	}
}
