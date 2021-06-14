package home.practice.java.immutable;

import java.util.TreeSet;

public class Treeset 
{ 
    public static void main(String[] args) 
    { 
        TreeSet<String> treeSet = new TreeSet<>(); 
  
        treeSet.add("Geeks"); 
        treeSet.add("for"); 
        treeSet.add("Geeks"); 
        treeSet.add("GeeksforGeeks"); 
        
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Pineapple");
        treeSet.add("Orange");
  
        for (String temp : treeSet) 
            System.out.printf(temp + " "); 
  
        System.out.println("\n"); 
    } 
} 