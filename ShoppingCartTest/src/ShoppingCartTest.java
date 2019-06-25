import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCreateCart() {
		ShoppingCart cart=new ShoppingCart();
		int numItems=cart.getItemCount();
		assertEquals(0,numItems);
	}
	///empty cartd testing , firstly need to add then empty a cart
	
	@Test
	public void testEmptyCart() {
		ShoppingCart cart=new ShoppingCart();
		Product p1=new Product("coffee",200);
		Product p2=new Product("donuts",200);
		cart.addItem(p1);
		cart.addItem(p2);
		cart.empty();
		assertEquals(0,cart.getItemCount());
		
		
	}
	
}
