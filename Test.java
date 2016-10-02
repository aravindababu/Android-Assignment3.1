/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author user2
 */
public class Test {
    
    //Even though there is a static block defined but without main() method it will
    //give you an error "No Main method found"
    //Since there is no main method defined in the code it will give you "a.Compile Error" 
    //if main method is defined it will compile and print 10
    
    static{
    print(10);
    }
    
    static void print (int x) {
    System.out.println (x);
    System.exit(0);
}

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
    //}
    
}

//Result= a.Compile Error
