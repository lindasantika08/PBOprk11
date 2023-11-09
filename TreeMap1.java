/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treemap1;

/**
 *
 * @author LINDA
 */
import java.util.*;

// Deklarasi kelas TreeMap1
public class TreeMap1 {
  public static void main(String args[]) {  
  
    // Membuat peta pohon (TreeMap)
    TreeMap<String, String> tree_map1 = new TreeMap<String, String>();      
  
    // Menambahkan elemen-elemen ke dalam peta
    tree_map1.put("C1", "Red");
    tree_map1.put("C2", "Green");
    tree_map1.put("C3", "Black");
    tree_map1.put("C4", "White"); 
    
    // Mencetak nilai peta pohon
    System.out.println(tree_map1);
    
    // Memeriksa apakah peta pohon mengandung kunci tertentu (C1)
    if(tree_map1.containsKey("C1")) {
        System.out.println("The Tree Map contains key C1");
    } else {
        System.out.println("The Tree Map does not contain key C1");
    }
    
    // Memeriksa apakah peta pohon mengandung kunci tertentu (C5)
    if(tree_map1.containsKey("C5")) {
        System.out.println("The Tree Map contains key C5");
    } else {
        System.out.println("The TreeMap does not contain key C5");
    }
  }
}

