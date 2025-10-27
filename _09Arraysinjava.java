package Javacodewithharrybasics.java;

public class _09Arraysinjava {
    public static void main(String[] args) {
        int marks[]  = {1,2,3,5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        marks[3] = 34;//this will update
        System.out.println(marks[3]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("This is for each loop" );
        //for each loop
        for(int value : marks) {
            System.out.println(value);
        }


    }
}
