package week8;

public class Circle {
	
		//properties
		Double radius;
		
		//constructor
		public Circle(Double radius){
			
			this.radius=radius;
		}
		
		public static double area(double t1,double radius)
		{
			
			double r=t1*Math.pow(radius, 2);
			return r;
			
		}
		
		
		
		
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double d=area(5,2);
			System.out.println("result is"+d);
			

		}

	}


