package movieclub;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental aRental : _rentals) {           
            double thisAmount = aRental.getRentalCost();
            //show figures for this rental
            result += "\t" + aRental.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenderPoints())
                + " frequent renter points";
        return result;
    }
    
    public double getTotalAmount(){
         double totalAmount = 0;
         for (Rental each : _rentals) {           
            double thisAmount = each.getRentalCost();
            totalAmount += thisAmount;
         }
         return totalAmount;
    }
    
    private int getTotalFrequentRenderPoints(){
        int total = 0;
    
        for(Rental rental : _rentals){
            total += rental.getFrequentRenterPoints();
        }
        return total;
    }


}
