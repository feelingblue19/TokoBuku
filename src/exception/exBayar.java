/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Nyoman Chandra
 */
public class exBayar extends Exception {
    public String message()
    {
        return "Jumlah bayar tidak boleh kurang dari total";
    }
}
