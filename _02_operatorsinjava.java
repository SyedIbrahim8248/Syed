package Javacodewithharrybasics.java;

public class _02_operatorsinjava {
    public static void main(String[] args) {
        /*operators in java
        operand,operator,operand =result
        4       +           7   =  11
        Types of operators in java.
        1.Arithmetic operators
        2.Assignment operators
        3.Logical operators
        4.Comparison operators*/
        int num1 = 45;
        int num2 = 45;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);
        /*Comparison operators
        1.== checks for equality two values
        2. !=checks if two values are not equal
        3. <
        4. >
        5. <=
        6. >=
         */
        int num3 = 5;
        int num4 = 7;
        System.out.println(num3 == num4);
        System.out.println(num3 > num4);
        System.out.println(num3 < num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 <= num4);
        System.out.println(num3 != num4);
        /* Logical operators
        1. && Logical operators -returs true only if both conditions are true
        2. || Logical or operators - returs true if any one conditions is true
        3.  != Logical not - Reverse the result from true to false and vice versa
        */
        int num5 = 5;
        int num6 = 2;
        System.out.println(num5 > 2 && num6 > 1);
        System.out.println(num5 < 6 || num6 < 1);
        System.out.println(num5 !=  num6);







    }
}
