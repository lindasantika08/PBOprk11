/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashmap1;

/**
 *
 * @author LINDA
 */

import java.util.*;

// Deklarasi kelas HashMap1
public class HashMap1 {
  public static void main(String args[]) {
  
    // Membuat dua hash maps
    HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
    HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

    // Mengisi hash map pertama
    hash_map1.put(1, "Red");
    hash_map1.put(2, "Green");
    hash_map1.put(3, "Black");
    
    // Mencetak nilai hash map pertama
    System.out.println("\nValues in first map: " + hash_map1);
    
    // Mengisi hash map kedua
    hash_map2.put(4, "White");
    hash_map2.put(5, "Blue");
    hash_map2.put(6, "Orange");
    
    // Mencetak nilai hash map kedua
    System.out.println("\nValues in second map: " + hash_map2);

    // Menambahkan semua nilai dari hash map pertama ke hash map kedua
    hash_map2.putAll(hash_map1);
    
    // Mencetak nilai hash map kedua setelah penambahan
    System.out.println("\nNow values in second map: " + hash_map2);
  }
}


