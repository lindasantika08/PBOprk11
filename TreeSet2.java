/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treeset2;

/**
 *
 * @author LINDA
 */

import java.util.TreeSet;

// Deklarasi kelas TreeSet2
public class TreeSet2 {
  public static void main(String[] args) {
  
    // Membuat TreeSet kosong yang berisi elemen bertipe String
    TreeSet<String> tree_set = new TreeSet<String>();
    
    // Menambahkan nilai ke dalam TreeSet menggunakan metode add()
    tree_set.add("Red");
    tree_set.add("Green");
    tree_set.add("Orange");
    tree_set.add("White");
    tree_set.add("Black");

    // Iterasi melalui TreeSet menggunakan loop for-each
    for (String element : tree_set) {
      System.out.println(element);
    }
  }
}


