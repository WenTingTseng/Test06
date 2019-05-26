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
	@Before
	public void setUp() {
		d=new DataController();
		s=new StudentGradeController();
		c=new DataCompute();
	}

	@Test
	public void getAllStudentGradeTest() {
		String[] allName={"Wendy","Tony","Jeff"};
		int[] allGrades={74,70,68};
		HashMap<String, Integer> expected=new HashMap<>();
		expected.put("Wendy",74);
		expected.put("Tony", 70);
		expected.put("Jeff",68);

		HashMap<String, Integer> actual=d.getAllStudentGrade(allName, allGrades);
		assertEquals(expected, actual);
	}
	@Test
	public void getAllSchoolGradeTest() {
		String[] SchoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] SchoolGrades= {73,70,68,67,65,65,55};
		HashMap<String, Integer> expected=new HashMap<>();
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
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] allName= {"Wendy","Tony","Jeff"};
		LinkedHashMap<String,ArrayList<String>> expected=new LinkedHashMap<String,ArrayList<String>>();
		ArrayList<String> wendy_ls = new ArrayList<>();
		wendy_ls.add("台大");
		wendy_ls.add("成大");
		wendy_ls.add("中央");
		ArrayList<String> tony_ls = new ArrayList<>();
		tony_ls.add("成大");
		tony_ls.add("中興");
		tony_ls.add("中正");
		ArrayList<String> jeff_ls = new ArrayList<>();
		jeff_ls.add("中正");
		jeff_ls.add("中山");
		jeff_ls.add("逢甲");
		expected.put("Wendy",wendy_ls);
		expected.put("Tony",tony_ls);
		expected.put("Jeff",jeff_ls);
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
