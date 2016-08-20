import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2016/8/20.
 */
public class Customer {

    private String name;

    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String statement(){
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
        }
        //add footer lines
        result += "Amount owed is" + String.valueOf(getTotalCharge()) +"\n" ;
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())+" frequent renter points";

        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return  result;
    }


    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return  result;
    }

    public Vector<Rental> getRentals() {
        return _rentals;
    }

    public void setRentals(Vector<Rental> rentals) {
        this._rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
