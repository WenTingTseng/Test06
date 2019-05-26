package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.example.StudentGradeController;

public class StudentGradeControllerTest {
	StudentGradeController s;
	@Before
	public void setUp() throws Exception {
		s=new StudentGradeController();
	}


	@Test
	public void SortTest() {
        LinkedHashMap<String, Integer> list=new LinkedHashMap<String, Integer>();
		
		list.put("Tom", 72);
		list.put("Jeff", 71);
		list.put("Wendy", 70);
	
		ArrayList<Entry<String, Integer>> ls=new ArrayList<Entry<String, Integer>>();
		ls.addAll(list.entrySet());
		HashMap<String, Integer> Grades=new HashMap<String, Integer>();
		Grades.put("Wendy", 70);
		Grades.put("Tom", 72);
		Grades.put("Jeff", 71);
	
	
		assertEquals(ls,s.Sort(Grades));
	}

}
