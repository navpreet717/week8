package week8;

public class Circle {
	
		//properties
		Double radius;
		
		//constructor
		public Circle(Double radius){
			
			this.radius=radius;
		}
		
		
	
		
		
		//custom methods
		public double getArea()
		{
			double area=Math.PI*this.radius*this.radius;
			System.out.println("AreA is"+area);
			return area;
		}
		
		public double getCircumFerence()
		{
			double c=Math.PI*2*this.radius;
			System.out.println("CircumFerence is"+c);
			return c;
		}
		public double getDiameter()
		{
			double diameter=10;
			System.out.println("Diameter is"+diameter);
			return diameter;
		}
		//getter setter

		public Double getRadius() {
			return radius;
		}


		public void setRadius(Double radius) {
			this.radius = radius;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			

		}
		

	}


