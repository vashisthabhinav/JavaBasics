package com.company.beginer;
    class Cylinder{
        private int radius;
        private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
class Rectangle1{
    private int length;
    private int  breadth;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Ch9_ps_Access_modifiers_and_constructors {
    public static void main(String[] args) {
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        // Problem 3
        Rectangle1 r = new Rectangle1(4, 5);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
