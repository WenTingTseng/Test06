package main.java.example;


import java.util.*;


public class Main {
	
	
	public static void main() {
	
		String[] allName= {"王曉明","曾筱婷","甘柔","周湯豪","韓瑜","李秉乾","李小鵬","劉鎧","陳杉林","周蕙慈","張一山","胡意悅"};
		int[] allGrades= {74,70,68,73,53,71,72,56,60,66,64,69};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"},{"中正","逢甲","輔大"},{"輔大","逢甲","中原"},{"清大","交大","成大"}
		,{"台大","清大","成大"},{"中正","逢甲","中原"},{"中山","輔大","中原"},{"中興","輔大","中原"},{"清大","中山","中原"},{"中央","中山","逢甲"}};
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
		while(true) {
			System.out.println("請輸入服務的選項:(1)查看榜單結果(2)查看各校錄取率(3)結束");
			choice=scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("*****************榜單***************");
				LinkedHashMap<String,String> volu=d.ComputeVolunteer(volunteers,grades,allSchoolGrade,allSchoolQuota);
				for (Object key : volu.keySet()) {
					 System.out.println(key + " : " + volu.get(key));
				}
				System.out.println("*************************************");
				break;
			case 2:
				
				System.out.println("*********************錄取率**************");
				LinkedHashMap<String,String> rate=d.ComputeRate(volunteers,grades,allSchoolGrade,allSchoolQuota);
				for (Object key : rate.keySet()) {
					 System.out.println(key + " : " + rate.get(key));
				}
				System.out.println("*************************************");
				break;
			case 3:
				System.out.println("結束!");
				break;
			 default:
				    break;
			}
			if(choice==3) {
				break;
			}
		}
	}
}