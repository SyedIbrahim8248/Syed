package Javacodewithharrybasics.java;

import java.util.Scanner;

public class _06a_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote");
        }
    }
}
