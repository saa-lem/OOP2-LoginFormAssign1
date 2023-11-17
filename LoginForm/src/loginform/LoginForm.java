/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author Antony Wasonga
 */

import java.util.Scanner;

public class LoginForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);

        // Set correct username and password
        String correctUsername = "user123";
        String correctPassword = "pass123";

        int attempts = 3;

        while (attempts > 0) {
            // Ask for username
            System.out.print("Enter username: ");
            String usernameInput = scanner.nextLine();

            // Ask for password
            System.out.print("Enter password: ");
            String passwordInput = scanner.nextLine();

            // Check if the entered username and password are correct
            if (correctUsername.equals(usernameInput) && correctPassword.equals(passwordInput)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect username or password. Attempts left: " + (--attempts));
            }
        }

        if (attempts == 0) {
            System.out.println("Login failed. Maximum attempts reached.");
        }

        scanner.close();
    }
}


   
        
        
        
        
        
        
        
    
    

