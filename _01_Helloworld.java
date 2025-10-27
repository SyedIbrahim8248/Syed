package Javacodewithharrybasics.java;

public class _01_Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(1+2);
        System.out.println("1+2");
        //variable just like water  - bucket masala - box
        //In java: variables are containers which store data values
        //string ,int ,float ,char ,boolean.
        //how to declare variables;
        //syntax -<datatype> <variableName> = <value>;
        String name = "ibrahim";
        System.out.println(name);
        int a = 45;
        float b = 45.22f;
        System.out.println(a);
        System.out.println(b);
        boolean isAdult = false;
        System.out.println(isAdult);
        /*Rulles for constructing name of varibles in java
        1,can contain digits,inderscore,dollar signs,letters
        2,should begin with a letter,$ or_
        3.Java is case sensitive lang which means that harry and Harry are two different variables altogether.
        4.Should not contain whitespaces.
        5.You can not use reserved keywords from java*/
        /*two types Java data types:
        1.Primitive -byte (1byte),short(2bytes),int(4bytes),long(8bytes),float(4bytes),double(8bytes),boolean(1bit)
        char(2 bytes).
        2.Non Primitive or reference data type*/
        byte u = 56;
        byte y =-56;
        System.out.println(u);
        System.out.println(y);
        int z =89;
        System.out.println(z);
        float s = 87.0f;
        System.out.println(s);
        double d = 87.56;
        System.out.println(d);
        short i = 5;
        System.out.println(i);
        char ch = 'h';
        System.out.println(ch);
        long l = 545789564875l;
        System.out.println(l);





    }
}
