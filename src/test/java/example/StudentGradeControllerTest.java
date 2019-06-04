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
	public void sortTest1() {
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
		
		assertEquals(ls,s.theSort(grades));
	}
	@Test
	public void sortTest2() {
        LinkedHashMap<String, Integer> list=new LinkedHashMap<>();
		
		list.put("曾筱婷", 75);
		list.put("王曉明", 64);
		list.put("甘柔", 48);
	
		ArrayList<Entry<String, Integer>> ls=new ArrayList<>();
		ls.addAll(list.entrySet());
		HashMap<String, Integer> grades=new HashMap<>();
		grades.put("王曉明", 64);
		grades.put("曾筱婷", 75);
		grades.put("甘柔", 48);

		assertEquals(ls,s.theSort(grades));
	}
	@Test
	public void sortTest3() {
        LinkedHashMap<String, Integer> list=new LinkedHashMap<>();
		
		list.put("周湯豪", 68);
		list.put("韓國瑜", 53);
		list.put("李秉乾", 39);
		
		ArrayList<Entry<String, Integer>> ls=new ArrayList<>();
		ls.addAll(list.entrySet());
		HashMap<String, Integer> grades=new HashMap<>();
		grades.put("李秉乾", 39);
		grades.put("韓國瑜", 53);
		grades.put("周湯豪", 68);

		assertEquals(ls,s.theSort(grades));
	}
}
