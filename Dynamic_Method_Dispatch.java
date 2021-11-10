package com.company.beginer;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
         Phone obj = new Phone(); // Allowed
         SmartPhone smobj = new SmartPhone(); // Allowed
         obj.on();

        Phone obj1 = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
        obj1.showTime();
        obj1.on();
        //obj1.music(); //Not Allowed

    }
}
