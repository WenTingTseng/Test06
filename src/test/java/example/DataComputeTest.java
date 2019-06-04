package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import main.java.example.DataCompute;
import main.java.example.DataController;

public class DataComputeTest {
	DataController d;
	DataCompute c;
	@Before
	public void setUp() {
		d=new DataController();
		c=new DataCompute();
	}


	@Test
	public void computeVolunteerTest1()
	{
		String[] allName= {"Wendy","Tony","Jeff"};
		int[] allGrades= {74,70,68};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] schoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] quota= {5,8,4,4,3,3,6};

		LinkedHashMap<String, Integer> grades=d.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=d.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=d.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=d.getAllSchoolGrade(schoolName);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<>();
		expected.put("Wendy","台大");
		expected.put("Tony","成大");
		expected.put("Jeff","中正");
		LinkedHashMap<String,String> actual=c.ComputeVolunteer(volunteers, grades, allSchoolGrade, allSchoolQuota);
		assertEquals(actual,expected);
	}
	@Test
	public void computeVolunteerTest2()
	{
		String[] allName= {"王曉明","曾筱婷","甘柔"};
		int[] allGrades= {75,56,68};
		String[][] allVolunteer= {{"台大","交大","清大"},{"輔大","逢甲","中原"},{"中央","中興","中山"}};
		String[] schoolName= {"台大","交大","清大","成大","中央","中興","中正","中山","逢甲","輔大","中原"};;
		int[] quota= {5,5,3,8,4,4,3,3,6,6,5};

		LinkedHashMap<String, Integer> grades=d.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=d.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=d.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=d.getAllSchoolGrade(schoolName);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<>();
		expected.put("王曉明","台大");
		expected.put("甘柔","中央");
		expected.put("曾筱婷","逢甲");
		LinkedHashMap<String,String> actual=c.ComputeVolunteer(volunteers, grades, allSchoolGrade, allSchoolQuota);
		assertEquals(actual,expected);
	}
	@Test
	public void computeVolunteerTest3()
	{
		String[] allName= {"周湯豪","韓國瑜","李秉乾"};
		int[] allGrades= {73,53,71};
		String[][] allVolunteer= {{"中正","逢甲","輔大"},{"輔大","逢甲","中原"},{"清大","交大","成大"}};
		String[] schoolName= {"台大","交大","清大","成大","中央","中興","中正","中山","逢甲","輔大","中原"};;
		int[] quota= {5,5,3,8,4,4,3,3,6,6,5};

		LinkedHashMap<String, Integer> grades=d.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=d.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=d.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=d.getAllSchoolGrade(schoolName);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<>();
		expected.put("周湯豪","中正");
		expected.put("李秉乾","交大");
		expected.put("韓國瑜","中原");
		LinkedHashMap<String,String> actual=c.ComputeVolunteer(volunteers, grades, allSchoolGrade, allSchoolQuota);
		assertEquals(actual,expected);
	}
	@Test
	public void computeRateTest1() {
		String[] allName= {"Wendy","Tony","Jeff"};
		int[] allGrades= {74,70,68};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] schoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] quota= {5,8,4,4,3,3,6};

		LinkedHashMap<String, Integer> grades=d.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=d.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=d.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=d.getAllSchoolGrade(schoolName);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<>();
		expected.put("台大","20.00%");
		expected.put("成大","12.50%");
		expected.put("中央","0.00%");
		expected.put("中興","0.00%");
		expected.put("中正","33.33%");
		expected.put("中山","0.00%");
		expected.put("逢甲","0.00%");
		
		LinkedHashMap<String,String> actual=c.ComputeRate(volunteers, grades, allSchoolGrade, allSchoolQuota);
		assertEquals(actual,expected);
	}
}
