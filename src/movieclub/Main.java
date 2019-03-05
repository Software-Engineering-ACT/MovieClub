package movieclub;


public class Main {
	public static void main(String[] args) {
            
		Movie Twister = new Movie("Twister", new RegularPrice());
		Movie Mickey = new Movie("Mickey", new ChildrensPrice());
                Movie theRock = new Movie("The Rock", new RegularPrice());
		
		Rental aRental = new Rental(Twister, 3);
		Rental bRental = new Rental(Mickey, 5);
                Rental cRental = new Rental(theRock, 4);
		
		Customer Bob = new Customer("Bob");
		Bob.addRental(aRental);
		Bob.addRental(bRental);
                Bob.addRental(cRental);
                
            double totalAmount = Bob.getTotalAmount();
		
		System.out.println(Bob.statement());
	}	
}
