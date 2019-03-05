package movieclub;

/**
 *
 * @author chaikal
 */
public class RegularPrice extends Price {

    @Override
    public double getCharge(int days) {
        int result = 2;
        if (days > 2) {
            result += (days - 2) * 1.5;
        }
        return result;
    }

}
