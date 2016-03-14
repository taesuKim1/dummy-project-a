package org.batcha.dummy.project.a;

import static org.junit.Assert.*;

import org.junit.Test;

public class AStuffTest {

	@Test
	public void test() {
		ProjectAAPI api = new AStuff();
		String input = "test";
		String output = api.typicalAStuff(input);
		assertTrue(output.equals(input));		
	}

}
