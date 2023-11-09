/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treemap2;

/**
 *
 * @author LINDA
 */

import java.util.*;

// Deklarasi kelas TreeMap2
public class TreeMap2 {
  public static void main(String args[]) {  
  
    // Membuat peta pohon (TreeMap)
    TreeMap<String, String> tree_map1 = new TreeMap<String, String>();      
  
    // Menambahkan elemen-elemen ke dalam peta
    tree_map1.put("C1", "Red");
    tree_map1.put("C2", "Green");
    tree_map1.put("C3", "Black");
    tree_map1.put("C4", "White"); 
    
    // Memeriksa apakah peta pohon mengandung nilai tertentu (Green)
    if(tree_map1.containsValue("Green")) {
        System.out.println("The TreeMap contains value Green");
    } else {
        System.out.println("The TreeMap does not contain value Green");
    }
    
    // Memeriksa apakah peta pohon mengandung nilai tertentu (Pink)
    if(tree_map1.containsValue("Pink")) {
        System.out.println("The TreeMap contains value Pink");
    } else {
        System.out.println("The TreeMap does not contain value Pink");
    }
  }
}


