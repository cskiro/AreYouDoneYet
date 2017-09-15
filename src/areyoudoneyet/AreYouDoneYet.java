/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areyoudoneyet;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 1
 * Write a program that reads words from the keyboard until the word 'done' is
 * entered. For each word, except done, report whether the first character is 
 * equal to its last character.
 * 
 * @author skiroc
 */
public class AreYouDoneYet {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         
        String wordEntered;
        boolean isDone;
      
        System.out.println("Please enter a word and I'll tell you if the first "
                + "character matches its last character..");
        
        System.out.println("Enter 'done' to end the program");
        System.out.println("Please enter a word:");
        
        wordEntered = kb.next();
        if (checkString(wordEntered) == true) {
           System.out.print(wordEntered + " begins and ends with the same letter!" 
                + "\r\n");
        }
        
        isDone = wordEntered.equals("done");
        
        while (!isDone) {
            System.out.println("Please enter another word:");
            wordEntered = kb.next();
            if (wordEntered.toLowerCase().equals("done")) {
                System.exit(0);
            }  // end if
            
            if (checkString(wordEntered) == true) {
                System.out.print(wordEntered + " begins and ends with the same letter!" 
                + "\r\n");
            } // end if 
           
        } // end while
        
    } // end main
      
   public static boolean checkString (String word) {
       
       int stringLength = word.length();
       word = word.toLowerCase();
       char firstLetter = word.charAt(0);
       char lastLetter = word.charAt(stringLength -1);
       
       if (firstLetter == lastLetter) {
           return true;
       } else {
           return false;
       } // end -f-else
       
   } // end checkString()
    
} //end class
