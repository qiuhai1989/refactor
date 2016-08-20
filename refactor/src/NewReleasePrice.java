/**
 * Created by Administrator on 2016/8/20.
 */
public class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_REALEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return  daysRented*3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented>1)?2:1;
    }
}
