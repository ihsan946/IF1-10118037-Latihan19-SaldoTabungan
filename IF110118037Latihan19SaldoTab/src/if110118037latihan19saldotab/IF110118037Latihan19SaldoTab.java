/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan19saldotab;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program saldo tabungan
 *                                        dengan bunga 15%
 */
public class IF110118037Latihan19SaldoTab {

    
    public static void main(String[] args) {
        double bunga;
        double saldo = 2500000;
        
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        rupiah.setDecimalFormatSymbols(formatRp);
            for(int i = 1;i<=6;i++){
                bunga =  0.15 * saldo ;
                saldo = bunga + saldo;
                System.out.printf("Saldo di bulan ke- " + i +  " %s%n",rupiah.format(saldo) );
            
        }
    }
    
}
