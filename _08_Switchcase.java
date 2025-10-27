package Javacodewithharrybasics.java;

import java.util.Scanner;

public class _08_Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /*   int age = sc.nextInt();
        switch (age) {
            case 12:
                System.out.println("You are 12 years old");
            case 56:
                System.out.println("You are 56 years old");
            case 16:
                System.out.println("You are 16 years old");
                default:
                System.out.println("You did not match any of the cases");*/
                int old = sc.nextInt();
                switch (old) {
                    case 70:
                        System.out.println("You are 70 years old");
                        break;
                        case 80:
                            System.out.println("You are 80 years old");
                            break;
                            case 90:
                                System.out.println("You are 90 years old");
                                break;
                                case 100:
                                    System.out.println("You are 100 years old");
                                    break;
                }

        }
    }
