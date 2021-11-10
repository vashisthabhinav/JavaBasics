package com.company.beginer;
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of the circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle2{
    public int l,b;
    Rectangle2(){
        System.out.println("Non param of the Rectangle");
    }
    Rectangle2(int l,int b){
        System.out.println("I am rectangle parameterized constructor");
        this.l = l;
        this.b = b;
    }
    public int area(){
        return this.l*this.b;
    }
}
class Cuboid extends Rectangle2{
    public int h;
    Cuboid(){
        System.out.println("Non param of the Cuboid");
    }
    Cuboid(int l,int b,int h){
        super(l,b);
        this.h = h;
    }
    public int volume(){
        return this.l*this.b*this.h;
    }
}
public class Chapter_10_Inheritance_Practice_Set {
    public static void main(String[] args) {
//        Cylinder1 obj = new Cylinder1(12, 4);
//        Circle1 obj1= new Circle1();
//        obj1.radius=3;
//        System.out.print("Radius is: ");
//        System.out.println(obj1.radius);
//        System.out.print("Area is: ");
//        System.out.println(obj1.area());
//        System.out.print("Volume is: ");
//        System.out.println(obj.volume());
//        Rectangle2 obj2 = new Rectangle2();
//        obj2.l = 3;
//        obj2.b = 4;
//        System.out.println(obj2.area());
//        Rectangle2 obj3 = new Rectangle2(3,4);
//        System.out.println(obj3.area());
        Cuboid obj4 = new Cuboid(3,4,5);
        System.out.print("Volume of Cuboid is: ");
        System.out.println(obj4.volume());
    }
}