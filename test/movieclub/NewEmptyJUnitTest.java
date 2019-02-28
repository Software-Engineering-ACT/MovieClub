package movieclub;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chaikal
 */
public class NewEmptyJUnitTest {

     @Test
     public void testMovieS() {
         Movie Twister = new Movie("Twister", Movie.REGULAR);
         Movie Mickey = new Movie("Mickey", Movie.CHILDRENS);
         
         assertEquals("Twister" , Twister.getTitle()); 
         assertEquals("Mickey" , Mickey.getTitle()); 
         assertEquals( Movie.CHILDRENS , Mickey.getPriceCode());
         assertEquals( Movie.REGULAR , Twister.getPriceCode());
         
     }
     
     @Test
     public void testRental(){
         Movie Twister = new Movie("Twister", Movie.REGULAR);
         Movie Mickey = new Movie("Mickey", Movie.CHILDRENS);
         Rental r1 = new Rental(Mickey, 5);
         Rental r2 = new Rental(Twister,3);

         Customer bob = new Customer("Bob");
         bob.addRental(r1);
         bob.addRental(r2);
         
         String statement = bob.statement();
         System.out.println(statement);
         
         double rental1Cost = r1.getRentalCost();
         assertEquals(4.5, rental1Cost, 0.001);
         
         double rental2Cost = r2.getRentalCost();
         assertEquals(3.5, rental2Cost, 0.001);
     }
}
