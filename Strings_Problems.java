package com.company.beginer;

public class Strings_Problems {
    public static void main(String[] args) {
         //Problem 1
        String name = "Abhinav Vashisth";
        name = name.toLowerCase();
        System.out.println(name);

         //Problem 2
        String text = "I am Abhinav       Vashisth";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Dhoni");
        System.out.println(letter);

        // Problem 4
        String myString = "This  string contains double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "The Editor\nThe Tribune\nChandigarh\n\t<|Body of the Letter|>\n\tYours Sincerely\nAbhinav Vashisth";
        System.out.println(myLetter);
    }
}
