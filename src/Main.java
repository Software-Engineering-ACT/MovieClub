
public class Main {
	public static void main(String[] args) {
		Movie Twister = new Movie("Twister", Movie.REGULAR);
		Movie Mickey = new Movie("Mickey", Movie.CHILDRENS);
		
		Rental aRental = new Rental(Twister, 3);
		Rental bRental = new Rental(Mickey, 5);
		
		Customer Bob = new Customer("Bob");
		Bob.addRental(aRental);
		Bob.addRental(bRental);
		
		System.out.println(Bob.statement());
	}	
}
