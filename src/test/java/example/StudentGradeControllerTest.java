package test.java.example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.junit.Before;
import org.junit.Test;

import main.java.example.StudentGradeController;

public class StudentGradeControllerTest {
	StudentGradeController s;
	@Before
	public void setUp() {
		s=new StudentGradeController();
	}


	@Test
	public void sortTest() {
        LinkedHashMap<String, Integer> list=new LinkedHashMap<>();
		
		list.put("Tom", 72);
		list.put("Jeff", 71);
		list.put("Wendy", 70);
	
		ArrayList<Entry<String, Integer>> ls=new ArrayList<>();
		ls.addAll(list.entrySet());
		HashMap<String, Integer> grades=new HashMap<>();
		grades.put("Wendy", 70);
		grades.put("Tom", 72);
		grades.put("Jeff", 71);
	
	
		assertEquals(ls,s.Sort(grades));
	}

}
