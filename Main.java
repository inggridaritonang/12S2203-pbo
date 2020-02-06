/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagefundamental;

/**
 *
 * @author 14-12S18032 Sarah Siahaan
 * @author 14-12S18034 Inggrid Aritonang
 * 
 * 
 */

import java.util.ArrayList;

public class Main {
    
    /* program entrz point */
    public static void main(String[] _args){
        System.out.println("Hello,world!");
        
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " +b);
    
    gear++;
    result = !result;
    capitalC += 4;
    
    System.out.println(gear + ", " + result + ", " + capitalC + ", " +b);
    
    int hexVal = 0x1a;
    int binVal = 0b11010; 
            
    System.out.println(hexVal + ", " + binVal);      
    
    String name = "Wiro Sableng"; 
    Short gearObject = 1; 
    Boolean resultObj = true; 
 
System.out.println(name + ", " + gearObject + ", " + resultObj); 
 
    name = name.toUpperCase();
    gearObject++; 
    resultObj = (result == false) || !resultObj; 
 
System.out.println(name + ", " + gearObject + ", " + resultObj); 
    
int[][] numbers = new int[10][10]; 
 
for (int i = 0; i < numbers.length; ++i) {  
    for (int j = 0; j < numbers[i].length; ++j) {     
        numbers[i][j] = i + j;  
    }
}

    for(int i= 0; i < numbers.length; ++i) {   
    for (int j = 0; j < numbers[i].length; ++j) {
        System.out.print(numbers[i][j] + " ");  
    } 
    System.out.println(); }
    
    //challenge
    System.out.println();
    System.out.println("Challenge");
    
    ArrayList<Integer> Challenge = new ArrayList<Integer>();
    int number = 10;
    
    for(int x= 0; x < number; ++x){
        int y= 0;
        int z= 0;
        for(int t = 0; t < number; ++t){
            
            y = x + z;
            System.out.println(y + " ");
            z++;
        }
   
        System.out.println();
        
    }
        
    
    
