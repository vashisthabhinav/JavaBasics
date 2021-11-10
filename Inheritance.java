package com.company.beginer;
class Animal{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

}
class Dog extends Animal{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and setting y now");
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Animal b = new Animal();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Dog d = new Dog();
        d.setY(43);
        System.out.println(d.getY());
    }
}
