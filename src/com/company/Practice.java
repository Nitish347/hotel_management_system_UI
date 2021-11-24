package com.company;
class Cylinder{
    private int radius;
    private  int  height;

    public void setRadius(int radius){
        this.radius=radius;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public Cylinder(int radius,int height) {
        this.radius = radius;
        this.height=height;
    }
}

public class Practice {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(12,16);

        System.out.println("radius of the cylinder " + cylinder1.getRadius());
    }

}
