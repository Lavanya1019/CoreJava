package main;

import org.junit.jupiter.api.Test;

public class Calculator_Test {
	
	Calculator cal = new Calculator();
	
	@Test	 
	public void addTest() {
		int result = cal.add(10,20);
		
	}
	
	@Test
	public void subTest() {
		cal.subtraction();
		
	}
	@Test
	public void mulTest() {
		cal.multiplication();
	
}


}
