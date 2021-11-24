package com.company;
class Area{
    int lenght,width;
     double area(){
        return (0.5*lenght*width);
    }

}

public class Oop_triangle {
    public static void main(String[] args) {

    Area triangle = new Area();
    triangle.lenght=4;
    triangle.width = 4;
        System.out.println(triangle.area());
    }




}

