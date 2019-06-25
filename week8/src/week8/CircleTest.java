package week8;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
	//create junit file
			//write test case in junit file
	
	// --expected,actual output
			//run
	
	//see what passed or fail
	
	

	
	
//@Test tells junit to run function as test case &report back if test case passed or failed
	@Test
	public void testConstructor() {
		Circle c=new Circle((double) 5);
		double expectedRadius=5;
		double actualRadius=c.getRadius();
		assertEquals(expectedRadius,actualRadius,0.1);
	}
	@Test
	public void testArea() {
		Circle c=new Circle((double) 5);
		double expectedArea=Math.PI*5*5;
		double actualArea=c.getArea();
		assertEquals(expectedArea,actualArea,0.1);  //0.1 to compare doubles how precise you want like 4 digit or two after decimal
	}
	@Test
	public void testCircum() {
		Circle c=new Circle((double) 5);
		double expectedCircum=Math.PI*2*5;
		double actuaCircum=c.getCircumFerence();
		assertEquals(expectedCircum,actuaCircum,0.1);
	}
	@Test
	public void testDiameter() {
		Circle c=new Circle((double) 5);
		double expectedD=2*5;
		double actuaD=c.getDiameter();
		assertEquals(expectedD,actuaD,0.1);
		
	}

}
