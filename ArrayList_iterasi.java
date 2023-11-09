/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist_iterasi;

/**
 *
 * @author LINDA
 */

import java.util.*;

// Deklarasi kelas ArrayList_iterasi
public class ArrayList_iterasi {
  
  // Fungsi utama
  public static void main(String[] args) {
  
    // Membuat sebuah ArrayList bernama list_Strings yang berisi elemen-elemen bertipe String
    List<String> list_Strings = new ArrayList<String>();
    
    // Menambahkan beberapa warna ke dalam ArrayList
    list_Strings.add("Red");
    list_Strings.add("Green");
    list_Strings.add("Orange");
    list_Strings.add("White");
    list_Strings.add("Black");
    
    // Mencetak isi dari ArrayList menggunakan iterasi for-each
    for (String element : list_Strings) {
      System.out.println(element);
    }
  }
}


