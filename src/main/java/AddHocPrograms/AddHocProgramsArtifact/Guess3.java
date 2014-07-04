/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AddHocPrograms.AddHocProgramsArtifact;

/**
 * Guess the letter game 3rd Version
 * @author charl6
 */
public class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {
        
        char ch;
        char answer = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it?: ");
        
        ch = (char) System.in.read(); //read character from keyboard
        
        if(ch == answer) System.out.println("** Jou slim kind");
        else { 
            System.out.print("..try again you're ");
            
            if (ch < answer) System.out.println(" too low.");
            else System.out.println(" too high.");
        
        }
    }
}
