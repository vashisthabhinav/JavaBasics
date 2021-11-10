package com.company.beginer;
class Emp {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class Private_modifier {
    public static void main(String[] args) {
        Emp emp1 = new Emp();

        emp1.setName("Abhinav");
        System.out.println(emp1.getName());
        emp1.setId(10);
        System.out.println(emp1.getId());
    }
}
