package movieclub;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Theodore Chaikalis 
 */
public class NewEmptyJUnitTest {
    
    private static Movie Twister;
    private static Movie Mickey;
    private static Movie theRock;
    private static Rental r1;
    private static Rental r2, r3;  
    private static Customer bob;
    
    @BeforeClass
    public static void init(){
         Twister = new Movie("Twister", new RegularPrice());
         Mickey = new Movie("Mickey", new ChildrensPrice());
         theRock = new Movie("The Rock", new ActionPrice());
         r1 = new Rental(Mickey, 5);
         r2 = new Rental(Twister,3);
         r3 = new Rental(theRock, 4);

         bob = new Customer("Bob");
         bob.addRental(r1);
         bob.addRental(r2); 
         bob.addRental(r3);
                  
    }

     @Test
     public void testMovies() {
         assertEquals("Twister" , Twister.getTitle()); 
         assertEquals("Mickey" , Mickey.getTitle()); 
         assertEquals( Movie.CHILDRENS , Mickey.getPriceCode());
         assertEquals( Movie.REGULAR , Twister.getPriceCode());
         
     }
     
     @Test
     public void testRental(){

         String statement = bob.statement();
         System.out.println(statement);
         
         double rental1Cost = r1.getRentalCost();
         assertEquals(4.5, rental1Cost, 0.001);
         
         double rental2Cost = r2.getRentalCost();
         assertEquals(3.5, rental2Cost, 0.001);
          
     }
     
     @Test
     public void testTotalAmount(){
        double totalAmount = bob.getTotalAmount();
        
        assertEquals(23.5, totalAmount, 0.001);
     }
     
     
     @Test
     public void testNewReleasePrice(){
         Price p = new NewReleasePrice();
        double charge10 = p.getCharge(10);
         assertEquals(30.0, charge10, 0.001);
         
         double charge0 = p.getCharge(0);
         assertEquals(0, charge0, 0.0000001);
         int a = 1;
         int b = 2;
     }
}
