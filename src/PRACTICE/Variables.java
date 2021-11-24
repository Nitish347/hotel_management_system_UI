package PRACTICE;
class Num{
    int n=10;
}

public class Variables {
    public static void main(String[] args) {
        int a=25;
        float b=28.00f;
        long c = 1000L;
        byte d = 25;
        double e = 2000;
        System.out.println(a/5);
        System.out.println(b/4);
        System.out.println(c/a);
        System.out.println(e/a);
        Num var = new Num();
        System.out.println(var.n);
    }
}
