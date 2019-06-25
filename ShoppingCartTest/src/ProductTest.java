import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {
	/*
	 * tc1 creating product
	 *      when u create product,it has a title and price
	 *      tc2 checking if two products are equal
	 *      two products are equal if they have same name
	 */ 

	@Test
	public void testCreateProduct() {
		Product p=new Product("chair",40);
		assertEquals("chair",p.getTitle());
		assertEquals(40,p.getPrice(),0.01);
		
	}
	
	@Test
	public void testTwoProductEqual() {
		Product p1=new Product("shoes",100);
		Product p2=new Product("shoes",25);
		
		assertEquals(true,p1.equals(p2));
	}
}
