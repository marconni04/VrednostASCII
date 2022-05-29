/*Write a Java program to print the ascii value of a given character.*/

import java.util.Scanner;

class VrednostASCII{
    public static void main(String[] args){
        var s = new Scanner(System.in);
        
        System.out.println("Unesite neko slovo:");
        
        char unos = s.next().charAt(0);
      
        System.out.println("Vrednost karaktera u ASCII tabeli je: " + (int)unos);
    }
}

