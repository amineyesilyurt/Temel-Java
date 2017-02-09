/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinglist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amine
 */
public class UsingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        ArrayList a = new ArrayList(); //GENERIC ARRAYLIST
        a.add(new Integer(5)); //added an integer
        a.add("Endoscopises"); //added a string
        a.add(new Double(2.15));
        
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        
        
        List myList= new ArrayList<String>(); //CODE AGAINST INTERFACE
        myList.add("Sun");
        myList.add("Mornings");
        myList.add("New");
        myList.add("Day");
        
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        
    }
    
}
