package Keyboard_Input;
import java.util.Scanner;
public class AskingQustions {
    public static void main(String[] args)
    {
        Scanner keybord = new Scanner(System.in);
        int age;
        int tall;
        int inches;
        int weigh;
        System.out.print("How old are you?");
        age = keybord.nextInt();
        System.out.print("How many feet tall are you?");
        tall = keybord.nextInt();
        System.out.print("And how many inches?");
        inches = keybord.nextInt();
        System.out.print("How much do you weight?");
        weigh= keybord.nextInt();
        System.out.print("So,you're "+age+" old,"+tall+"'"+inches+'"'+"tall and "+weigh+" heavy");


    }
}
