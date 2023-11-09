/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priorityqueue2;

/**
 *
 * @author LINDA
 */

import java.util.PriorityQueue;

// Deklarasi kelas PriorityQueue2
public class PriorityQueue2 {
  public static void main(String[] args) {
  
    // Membuat Priority Queue kosong yang berisi elemen bertipe String
    PriorityQueue<String> pq1 = new PriorityQueue<String>();  
   
    // Menambahkan nilai ke dalam Priority Queue menggunakan metode add()
    pq1.add("Red");
    pq1.add("Green");
    pq1.add("Black");
    pq1.add("White");
    
    // Mencetak Priority Queue awal
    System.out.println("Original Priority Queue: " + pq1);
   
    // Menambahkan elemen baru ke dalam Priority Queue menggunakan metode offer()
    pq1.offer("Blue");
 
    // Mencetak Priority Queue setelah penambahan
    System.out.println("The New Priority Queue: " + pq1);
  } 
}


