/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashmap2;

/**
 *
 * @author LINDA
 */

import java.util.*;

// Deklarasi kelas HashMap2
public class HashMap2 {
  public static void main(String args[]) {
  
    // Membuat objek HashMap dengan nama hash_map
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    
    // Menambahkan pasangan kunci-nilai ke dalam peta hash menggunakan metode put()
    hash_map.put(1, "Red");
    hash_map.put(2, "Green");
    hash_map.put(3, "Black");
    hash_map.put(4, "White");
    hash_map.put(5, "Blue");
    
    // Mencetak nilai peta hash
    System.out.println("The Original linked map: " + hash_map);
    
    // Menghapus semua elemen dari peta hash menggunakan metode clear()
    hash_map.clear();
    
    // Mencetak nilai peta hash setelah penghapusan
    System.out.println("The New map: " + hash_map);
  }
}


