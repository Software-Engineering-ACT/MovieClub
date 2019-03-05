/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieclub;

/**
 *
 * @author chaikal
 */
public class ActionPrice extends Price {

    @Override
    public double getCharge(int days) {
        return days * 4.0;
    }
    
}
