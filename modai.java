package modai;

import java.io.IOException;
import java.util.Scanner;
public class ModAi { 

public static void main(String[] someVariableName) throws IOException {

String userChoice;
String userChoice2;
String userChoice3;
String userChoice4;
String userChoice5;
String userChoice6;
String userChoice7;
String userChoice8;

String userName;

Scanner in = new Scanner( System.in );


System.out.println("Please enter your username. \n");
userName = in.next(); 


System.out.println("\n" + userName + ", was that your torch? \n");
System.out.println("Enter Yes or No ==> ");
userChoice = in.next();
    
    if (userChoice.equals("Yes")) {
    System.out.println("Okay, thanks for telling me. You may carry on.");
    
                                }
    
    if (userChoice.equals("No")) {
    System.out.println("\nOkay, " + userName + ", do you know the rules? \n");
    System.out.println("Enter Yes or No ==> ");
    userChoice2 = in.next();
    
                                
    
        if (userChoice2.equals("Yes")) {
        System.out.println("\nOkay, could you please tell me the rules?");
        System.out.println("Tell the moderator what's against the first rule. ==> ");
        userChoice3 = in.next(); 
    
            if (userChoice3.equals("Griefing")) {
            System.out.println("\nCorrect. Now, what is the second rule?");
            System.out.println("Tell the moderator what's against the second rule. ==> ");
            userChoice4 = in.next(); 
            
                if (userChoice4.equals("Spamming")) {
                System.out.println("\nCorrect. Now, what is the third rule?");
                System.out.println("Tell the moderator what's against the third rule. ==> ");
                userChoice5 =in.next();
                
                    if (userChoice5.equals("Cheating")) {
                    System.out.println("\nCorrect! Now, can I trust you to continue playing on the server?");
                    System.out.println("Enter Yes or No ==> ");
                    userChoice6 =in.next();
                    
                        if (userChoice6.equals("Yes")) {
                        System.out.println("\nOkay then, enjoy Minecraft Online!");
                        System.out.println("You have successfully avoided being banned!");
                            
                        }
                        
                        if (userChoice6.equals("No")) {
                        System.out.println("\nYou have been banned from the server.");
                        }
                    }
                    
                    if (!userChoice5.equals("Cheating")) {
                    System.out.println("\nWrong.");
                    System.out.println("\nYou have been banned from the server.");
                    
                    }
                
                }
                
                if (!userChoice4.equals("Spamming")) {
                System.out.println("\nWrong.");
                System.out.println("\nYou have been banned from the server.");
                
                }
        
            }
            
            if (!userChoice3.equals("Griefing")) {
            System.out.println("\nWrong.");
            System.out.println("\nYou have been banned from the server.");
            }
            
        }
        
        if (userChoice2.equals("No")) {
        System.out.println("\nWell then let's go to the rule hall and read the rules together.");
        System.out.println("*You read the rules*");
        System.out.println("Do you understand the rules now, " + userName + "?");
        System.out.println("Enter Yes or No ==> ");
        userChoice7 =in.next(); 
        
            if (userChoice7.equals("Yes")) {
            System.out.println("\nCan I trust you to continue playing?");
            System.out.println("Enter Yes or No ==> ");
            userChoice8 =in.next();
            
                if (userChoice8.equals("Yes")) {
                System.out.println("\nOkay then, enjoy Minecraft Online!");
                System.out.println("You have successfully avoided being banned!");
                
                }
                
                if (userChoice8.equals("No")) {
                System.out.println("\nYou have been banned from the server.");
                
                }
                
            }
            
            if (userChoice7.equals("No")) {
            System.out.println("\nYou have been banned from the server.");
            
            }  
            
        }
        
    }
    
}
}

    
