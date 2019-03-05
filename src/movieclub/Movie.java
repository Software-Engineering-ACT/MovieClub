package movieclub;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int ACTION = 3;

    private String _title;
    private int _priceCode;

    private Price moviePrice;

    public Movie(String title, Price aPrice) {
        _title = title;
        moviePrice = aPrice;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public Price getMoviePrice() {
        return moviePrice;
    }

}
