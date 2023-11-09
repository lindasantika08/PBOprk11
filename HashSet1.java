/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashset1;

/**
 *
 * @author LINDA
 */

import java.util.HashSet;

// Deklarasi kelas HashSet1
public class HashSet1 {
  public static void main(String[] args) {
  
    // Membuat HashSet kosong yang berisi elemen bertipe String
    HashSet<String> h_set = new HashSet<String>();
    
    // Menambahkan nilai ke dalam HashSet menggunakan metode add()
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    h_set.add("Pink");
    h_set.add("Yellow");

    // Mencetak isi HashSet
    System.out.println("The Hash Set: " + h_set);
  }
}


