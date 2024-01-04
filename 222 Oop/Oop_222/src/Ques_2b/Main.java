package Ques_2b;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ExceptionDemo obj = new ExceptionDemo();
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int work_experience = input.nextInt();
// Write your answer for (iii). here.
        try {
            obj.UserCheck(age, work_experience);
        } catch (InvaliedUserException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
   }
}
