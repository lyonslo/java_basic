package Keyboard_Input;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String first_name,last_name,login;
        int grade,id;
        double GPA;
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.print("First name:");
        first_name=keyboard.nextLine();
        System.out.print("Last name:");
        last_name=keyboard.nextLine();
        System.out.print("Grade (9-12):");
        grade =keyboard.nextInt();
        System.out.print("Student ID:");
        id = keyboard.nextInt();
        System.out.print("Login:");
        login=keyboard.nextLine();
        System.out.print("GPA (0.0-4.0):");
        GPA=keyboard.nextDouble();
        System.out.println("Your information:");
        System.out.println("\tLogin:"+login);
        System.out.println("\tID:"+id);
        System.out.println("\tName:"+first_name+", "+last_name);
        System.out.println("\tGPA:"+GPA);
        System.out.println("\tGrade:"+grade);


    }
}
