package Javacodewithharrybasics.java;

import java.util.Scanner;

public class _11_Miniproject {
    public static void main(String[] args) {
        float number_1,number_2;
       /*System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        number_1 = sc.nextFloat();
        System.out.println("Enter the second number");
        //Scanner sc1 = new Scanner(System.in);
        //number_2 = sc1.nextFloat();
        //System.out.println(number_1);
        //System.out.println(" and ");
        //System.out.println(number_2);
        //String prompt = "Enter 0 for addition, 1 for " + "Substract, 2 for multiplication and 3 for division";
        //System.out.println(prompt);*/
Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding thse numbers");
                System.out.println("The result is:");
                break;
                case 1:
                    System.out.println("Subtracting ths numbers");
                    System.out.println("The result is:");
                    break;
                    case 2:
                        System.out.println("Multiplying ths numbers");
                        System.out.println("The result is:");
                        break;
                        case 3:
                            System.out.println("Dividing ths numbers");
                            System.out.println("The result is:");
                            break;
        }

    }
}
