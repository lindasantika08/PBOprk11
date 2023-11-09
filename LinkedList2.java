/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist2;

/**
 *
 * @author LINDA
 */

import java.util.LinkedList;

// Deklarasi kelas LinkedList2
public class LinkedList2 {
  public static void main(String[] args) {
  
    // Membuat linked list kosong yang berisi elemen bertipe String
    LinkedList<String> l_list = new LinkedList<String>();
    
    // Menambahkan nilai ke dalam linked list menggunakan metode add()
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("White");
    l_list.add("Pink");
    
    // Mencetak isi linked list menggunakan loop for-each
    for (String element : l_list) {
      System.out.println(element);
    }
  }
}

