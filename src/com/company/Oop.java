package com.company;

import javax.print.attribute.HashAttributeSet;

class Nitish{
    String name,caste,address;
    int age;
   void details(){
       System.out.println("your name is: " + name);
       System.out.println("your caste is : " + caste);
       System.out.println("your address is: " + address);
       System.out.println("your age is: " + age);
   }
}

public class Oop {
    public static void main(String[] args) {
        Nitish harry = new Nitish();
        harry.name="NITISH";
        harry.age = 21;
        harry.caste = "chaurasiya";
        harry.address = "khalilabad";
        harry.details();
    }


}

