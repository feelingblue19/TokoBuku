/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Marcell
 */
public class exHarga extends Exception {
    public String message()
    {
        return "Harga Buku Tidak Boleh Kurang Dari 0";
    }
}
