package week8;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		//Process for testing code
		//1.read the requirements
		//2decide what to test
		//r1 constructor sets radius
		// actual :c.getRadius() //use if else for testing
		Circle c=new Circle((double) 5);
		double expectedRadius=5;
		double actualRadius=c.getRadius();
		if(expectedRadius==actualRadius)
		{
			
			System.out.println("R1:WORKING");
			System.out.println("Expected Result"+expectedRadius);
			System.out.println("Actual Result"+actualRadius);
		}
		else
		{
			System.out.println("R1: not WORKING");
		}
	
		
		   
		   //r2: areas calculates properly
		
		double expectedArea=Math.PI*5*5;
		double actualArea=c.getArea();
		if(expectedArea==actualArea)
		{
			
			System.out.println("R2:WORKING");
			System.out.println("Expected Area"+expectedArea);
			System.out.println("Actual Area"+actualArea);
		}
		else
		{
			System.out.println("R2: not WORKING");
		}
		   //r3 circumference calculates properly
		double expectedCircum=Math.PI*2*5;
		double actuaCircum=c.getCircumFerence();
		if(expectedCircum==actuaCircum)
		{
			
			System.out.println("R3:WORKING");
			System.out.println("Expected Circum"+expectedCircum);
			System.out.println("Actual Circum"+actuaCircum);
		}
		else
		{
			System.out.println("R3: not WORKING");
		}
		   //r4  diameter calculates properly
		double expectedD=2*5;
		double actuaD=c.getDiameter();
		if( expectedD==actuaD)
		{
			
			System.out.println("R4:WORKING");
			System.out.println("Expected d"+expectedD);
			System.out.println("Actual d"+actuaD);
		}
		else
		{
			System.out.println("R4: not WORKING");
		}
		//3make test cases
		//excepted result
		//actual result
		//4
		//5 debug

	}

}
