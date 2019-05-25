package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.example.DataCompute;
import main.java.example.DataController;

public class DataComputeTest {
	DataController d;
	DataCompute c;
	@Before
	public void setUp() throws Exception {
		d=new DataController();
		c=new DataCompute();
	}


	@Test
	public void ComputeVolunteerTest()
	{
		String[] AllName= {"Wendy","Tony","Jeff"};
		int[] AllGrades= {74,70,68};
		String[][] AllVolunteer= {{"台大","成大","中央"},{"成大","中興","中正"},{"中正","中山","逢甲"}};
		String[] SchoolName= {"台大","成大","中央","中興","中正","中山","逢甲"};
		int[] Quota= {5,8,4,4,3,3,6};
		int[] SchoolGrades= {73,70,68,67,65,65,55};

		LinkedHashMap<String, Integer> Grades=d.getAllStudentGrade(AllName,AllGrades);
		LinkedHashMap<String,ArrayList<String>> Volunteers=d.getAllStudentVolunteer(AllName,AllVolunteer);
		LinkedHashMap<String,Integer> AllSchoolQuota=d.getAllSchoolQuota(SchoolName,Quota);
		LinkedHashMap<String,Integer> AllSchoolGrade=d.getAllSchoolGrade(SchoolName,SchoolGrades);
		
		LinkedHashMap<String,String> expected=new LinkedHashMap<String,String>();
		expected.put("Wendy","台大");
		expected.put("Tony","成大");
		expected.put("Jeff","中正");
		LinkedHashMap<String,String> actual=c.ComputeVolunteer(Volunteers, Grades, AllSchoolGrade, AllSchoolQuota);
		assertEquals(actual,expected);
	}

}
