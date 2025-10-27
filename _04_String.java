package Javacodewithharrybasics.java;

import java.util.Scanner;

public class _04_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = "Harry";
        String name2 = "CodeWithHarry";
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + "from" +name2);
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(3));
        System.out.println(name2.charAt(6));
        System.out.println(name1.contains("Harr"));
        System.out.println(name1.contains("Code"));
        System.out.println(name1.contains("Harry"));
        System.out.println(name2.contains("Code"));
        System.out.println(name2.contains("CodeW"));
        System.out.println(name2.contains("codew"));
        System.out.println(name2.contains("Harry"));
        System.out.println(name2.contains("CodeWithHarry"));
        System.out.println(name1.endsWith("i"));
        System.out.println(name1.indexOf("r"));




    }
}
