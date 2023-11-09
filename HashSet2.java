/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashset2;

/**
 *
 * @author LINDA
 */

import java.util.*;
import java.util.Iterator;

// Deklarasi kelas HashSet2
public class HashSet2 {
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

    // Mendapatkan Iterator untuk HashSet
    Iterator<String> p = h_set.iterator();
    
    // Iterasi melalui HashSet menggunakan Iterator
    while (p.hasNext()) {
      System.out.println(p.next());
    }
  }
}


