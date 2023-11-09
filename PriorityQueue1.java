/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priorityqueue1;

/**
 *
 * @author LINDA
 */

import java.util.PriorityQueue;

// Deklarasi kelas PriorityQueue1
public class PriorityQueue1 {
  public static void main(String[] args) {
  
    // Membuat PriorityQueue1 kosong yang berisi elemen bertipe String
    PriorityQueue<String> queue1 = new PriorityQueue<String>();  
    queue1.add("Red");
    queue1.add("Green");
    queue1.add("Orange");
    
    // Mencetak PriorityQueue1
    System.out.println("Priority Queue1: " + queue1);
    
    // Membuat PriorityQueue2 kosong yang berisi elemen bertipe String
    PriorityQueue<String> queue2 = new PriorityQueue<String>();  
    queue2.add("Pink");
    queue2.add("White");
    queue2.add("Black");
    
    // Mencetak PriorityQueue2
    System.out.println("Priority Queue2: " + queue2);
    
    // Menambahkan elemen-elemen dari queue2 ke queue1
    queue1.addAll(queue2);
    
    // Mencetak PriorityQueue1 setelah penambahan
    System.out.println("New Priority Queue1: " + queue1);
  }
}


