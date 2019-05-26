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
	public void computeVolunteerTest()
	{
		String[] allName= {"Wendy","Tony","Jeff"};
		int[] allGrades= {74,70,68};
		String[][] allVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] schoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] quota= {5,8,4,4,3,3,6};
		int[] schoolGrades= {73,70,68,67,65,65,55};

		LinkedHashMap<String, Integer> grades=d.getAllStudentGrade(allName,allGrades);
		LinkedHashMap<String,ArrayList<String>> volunteers=d.getAllStudentVolunteer(allName,allVolunteer);
		LinkedHashMap<String,Integer> allSchoolQuota=d.getAllSchoolQuota(schoolName,quota);
		LinkedHashMap<String,Integer> allSchoolGrade=d.getAllSchoolGrade(schoolName,schoolGrades);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<>();
		expected.put("Wendy","台大");
		expected.put("Tony","成大");
		expected.put("Jeff","中正");
		LinkedHashMap<String,String> actual=c.ComputeVolunteer(volunteers, grades, allSchoolGrade, allSchoolQuota);
		assertEquals(actual,expected);
	}
}
