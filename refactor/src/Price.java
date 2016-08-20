/**
 * Created by Administrator on 2016/8/20.
 */
public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    abstract int getFrequentRenterPoints(int daysRented);

}
