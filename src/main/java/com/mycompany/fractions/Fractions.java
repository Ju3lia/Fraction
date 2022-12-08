/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fractions;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class Fractions {

    public static void main(String[] args) {
        ArrayList<Fraction> fractionlist = new ArrayList<Fraction>();
        Fraction drob = new Fraction (3,4);
        fractionlist.add(0,drob);
        fractionlist.add(1, new Fraction (7,8));
        fractionlist.add(2, new Fraction (9,10));
        fractionlist.add (3, new Fraction (4,5));
        fractionlist.add (4, new Fraction (7,8));
        System.out.println (fractionlist);
        
        Fraction drob2 = new Fraction (7,8);
        if(fractionlist.contains(drob2)){
     
     System.out.println("Drob is Here "+ drob2.ToFormatString());
}
        System.out.println(fractionlist.indexOf(drob2));
        System.out.println (fractionlist.lastIndexOf(drob2));
        }
    }
            
        
  

