package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import main.java.example.DataCompute;
import main.java.example.DataController;
import main.java.example.StudentGradeController;

public class DataControllerTest {
	DataController d;
	StudentGradeController s;
	DataCompute c;
	String name="Wendy";
	@Before
	public void setUp() {
		d=new DataController();
		s=new StudentGradeController();
		c=new DataCompute();
	}

	@Test
	public void getAllStudentGradeTest1() {
		
		String[] allName={name,"Tony","Jeff"};
		int[] allGrades={74,70,68};
		HashMap<String, Integer> expected=new HashMap<>();
		expected.put(name,74);
		expected.put("Tony", 70);
		expected.put("Jeff",68);

		HashMap<String, Integer> actual=d.getAllStudentGrade(allName, allGrades);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllStudentGradeTest2() {
		
		String[] allName={"周杰倫","李秉乾","曾琬婷"};
		int[] allGrades={60,45,75};
		HashMap<String, Integer> expected=new HashMap<>();
		expected.put("周杰倫",60);
		expected.put("李秉乾", 45);
		expected.put("曾琬婷",75);

		HashMap<String, Integer> actual=d.getAllStudentGrade(allName, allGrades);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllSchoolGradeTest() {
		String[] schoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		HashMap<String, Integer> expected=new HashMap<>();
		expected.put("台大",73);
		expected.put("成大",70);
		expected.put("中央",68);
		expected.put("中興",67);
		expected.put("中正",65);
		expected.put("中山",65);
		expected.put("逢甲",55);
		HashMap<String, Integer> actual=d.getAllSchoolGrade(schoolName);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllStudentVolunteerTest()
	{
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] allName= {name,"Tony","Jeff"};
		LinkedHashMap<String,ArrayList<String>> expected=new LinkedHashMap<>();
		ArrayList<String> wendyls = new ArrayList<>();
		wendyls.add("台大");
		wendyls.add("成大");
		wendyls.add("中央");
		ArrayList<String> tonyls = new ArrayList<>();
		tonyls.add("成大");
		tonyls.add("中興");
		tonyls.add("中正");
		ArrayList<String> jeffls = new ArrayList<>();
		jeffls.add("中正");
		jeffls.add("中山");
		jeffls.add("逢甲");
		expected.put(name,wendyls);
		expected.put("Tony",tonyls);
		expected.put("Jeff",jeffls);
		LinkedHashMap<String,ArrayList<String>> actual=d.getAllStudentVolunteer(allName, allVolunteer);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllSchoolQuotaTest(){
		String[] schoolName={"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] quota= {5,8,4,4,3,3,6};
		HashMap<String, Integer> expected=new HashMap<>();
		expected.put("台大",5);
		expected.put("成大",8);
		expected.put("中央",4);
		expected.put("中興",4);
		expected.put("中正",3);
		expected.put("中山",3);
		expected.put("逢甲",6);
		HashMap<String, Integer> actual=d.getAllSchoolQuota(schoolName, quota);
		assertEquals(expected, actual);
	}
}
