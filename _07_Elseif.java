package Javacodewithharrybasics.java;

import java.util.Scanner;

public class _07_Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>20) {
            System.out.println("You are  and adult");
        } else if(age>15) {
            System.out.println("You are not a kid");
        } else {
            System.out.println("You are a kid");
        }

    }
}
