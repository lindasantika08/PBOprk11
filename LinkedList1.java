/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist1;

/**
 *
 * @author LINDA
 */

import java.util.LinkedList;

// Deklarasi kelas LinkedList1
public class LinkedList1 {
  public static void main(String[] args) {
  
    // Membuat sebuah linked list kosong yang berisi elemen bertipe String
    LinkedList<String> l_list = new LinkedList<String>();
    
    // Menambahkan nilai ke dalam linked list menggunakan metode add()
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("White");
    l_list.add("Pink");
    l_list.add("Yellow");

    // Mencetak isi linked list
    System.out.println("The linked list: " + l_list);
  }
}


