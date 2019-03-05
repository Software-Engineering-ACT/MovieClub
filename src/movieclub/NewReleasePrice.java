package movieclub;

/**
 *
 * @author chaikal
 */
public class NewReleasePrice extends Price {

    @Override
    public double getCharge(int days) {
        return days * 3.0;
    }
    
}
