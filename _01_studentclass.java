package OOPSbyraghavsir.java;

public class _01_studentclass {
    //creatin a new data type
    public static class student {
        String name;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        student x = new student();
        x.name = "ibrahim";
        x.rno = 76;
        x.percent = 92.5;
        student y = new student();
        y.name = "ahmad";
        y.rno = 80;
        y.percent = 92.5;
        System.out.println(x.name);
        System.out.println(x.rno+8);
        System.out.println(x.percent);
        System.out.println(y.name);
        System.out.println(y.rno+8);
        System.out.println(y.percent);
    }
}


