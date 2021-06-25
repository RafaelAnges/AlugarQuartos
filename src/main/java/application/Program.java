/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Quartos;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System. in);
        
        Quartos[] vect = new Quartos[10];
        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        for (int i=0; i<n;i++){
            System.out.println("");
            System.out.println("Rent #"+ (i+1) +":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            vect[room] = new Quartos(name, email);
            
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i <vect.length;i++){
            if(vect[i] != null){
                System.out.println(i + ": " +vect[i]);
            }
        }
       
        
        sc.close();
                
    }
    
}
