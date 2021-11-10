package com.company.beginer;
class Base{
    Base(){
        System.out.println("I am a constructor in the base class");
    }
    Base(int x){
        System.out.printf("I am an overloaded constructor with value of x as: %d\n",x);
    }
}

class Derived extends Base{
    Derived(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.printf("I am an overloaded constructor of Derived with value of y as: %d\n",y);
    }
}

class ChildOfDerived extends  Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.printf("I am an overloaded constructor of Derived with value of z as: %d\n",z);
    }
}
public class Inheritance_with_constructors {
    public static void main(String[] args) {
         Base b = new Base();
         Derived d1 = new Derived();
         Derived d2 = new Derived(14, 9);
         ChildOfDerived cd1 = new ChildOfDerived();
         ChildOfDerived cd2 = new ChildOfDerived(12, 13, 15);
    }
}
