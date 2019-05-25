package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

import main.java.example.DataCompute;
import main.java.example.DataController;
import main.java.example.StudentGradeController;

public class DataControllerTest {
	DataController d;
	StudentGradeController S;
	DataCompute c;
	@Before
	public void setUp() throws Exception {
		d=new DataController();
		S=new StudentGradeController();
		c=new DataCompute();
	}

	@Test
	public void getAllStudentGradeTest() {
		String[] AllName={"Wendy","Tony","Jeff"};
		int[] AllGrades={74,70,68};
		HashMap<String, Integer> expected=new HashMap<String, Integer>();
		expected.put("Wendy",74);
		expected.put("Tony", 70);
		expected.put("Jeff",68);

		HashMap<String, Integer> actual=d.getAllStudentGrade(AllName, AllGrades);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllSchoolGradeTest() {
		String[] SchoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] SchoolGrades= {73,70,68,67,65,65,55};
		HashMap<String, Integer> expected=new HashMap<String, Integer>();
		expected.put("台大",73);
		expected.put("成大",70);
		expected.put("中央",68);
		expected.put("中興",67);
		expected.put("中正",65);
		expected.put("中山",65);
		expected.put("逢甲",55);
		HashMap<String, Integer> actual=d.getAllSchoolGrade(SchoolName, SchoolGrades);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllStudentVolunteerTest()
	{
		String[][] AllVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] AllName= {"Wendy","Tony","Jeff"};
		LinkedHashMap<String,ArrayList<String>> expected=new LinkedHashMap<String,ArrayList<String>>();
		ArrayList<String> Wendy_ls = new ArrayList<String>(){{add("台大"); add("成大"); add("中央");}};
		ArrayList<String> Tony_ls = new ArrayList<String>(){{add("成大"); add("中興"); add("中正");}};
		ArrayList<String> Jeff_ls = new ArrayList<String>(){{add("中正"); add("中山");add("逢甲");}};
		expected.put("Wendy",Wendy_ls);
		expected.put("Tony",Tony_ls);
		expected.put("Jeff",Jeff_ls);
		LinkedHashMap<String,ArrayList<String>> actual=d.getAllStudentVolunteer(AllName, AllVolunteer);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllSchoolQuotaTest(){
		String[] SchoolName={"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] Quota= {5,8,4,4,3,3,6};
		HashMap<String, Integer> expected=new HashMap<String, Integer>();
		expected.put("台大",5);
		expected.put("成大",8);
		expected.put("中央",4);
		expected.put("中興",4);
		expected.put("中正",3);
		expected.put("中山",3);
		expected.put("逢甲",6);
		HashMap<String, Integer> actual=d.getAllSchoolQuota(SchoolName, Quota);
		assertEquals(expected, actual);
	}
}
