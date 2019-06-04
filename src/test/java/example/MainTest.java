package test.java.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.example.Main;

public class MainTest {

	@Test
	public void test() {
		new Main().main();
	}

}
