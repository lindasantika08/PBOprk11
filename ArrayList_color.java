/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist_color;

/**
 *
 * @author LINDA
 */
// Import kelas-kelas yang diperlukan dari paket java.util
import java.util.*;

// Deklarasi kelas ArrayList_color
public class ArrayList_color {
  
  public static void main(String[] args) {
    
    // Membuat objek List<String> dengan menggunakan kelas ArrayList
    List<String> list_Strings = new ArrayList<String>();
    
    // Menambahkan elemen-elemen berupa warna ke dalam objek list_Strings
    list_Strings.add("Red");
    list_Strings.add("Green");
    list_Strings.add("Orange");
    list_Strings.add("White");
    list_Strings.add("Black");
    
    // Mencetak isi dari objek list_Strings
    System.out.println(list_Strings);
  }
}


