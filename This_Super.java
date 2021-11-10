package com.company.beginer;

class Class1{
    int a;
    public int getA() {
        return a;
    }
    Class1(int a){
        this.a = a;
    }
    public int return_one(){
        return 1;
    }
    }
    class Class2 extends Class1{ Class2(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class This_Super {
    public static void main(String[] args) {
        Class1 a = new Class1(3);
        System.out.println(a.getA());
        System.out.println(a.return_one());
        //Class2 b = new Class2(12);

    }
}
