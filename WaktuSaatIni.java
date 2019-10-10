/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Menampilkan Waktu Saat Ini
 *
 * @author LENOVO
 */
public class WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime Date = LocalDateTime.now();
        DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss");
        String formattedDate =Date.format(dateFormatted);
        System.out.println(formattedDate);
    }
    
}
