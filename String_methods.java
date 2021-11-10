package com.company.beginer;

public class String_methods {
    public static void main(String[] args) {
        String name = "Abhinav";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Abhinav     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));//[Starting,Ending)

        System.out.println(name.replace('v', 'y'));
        System.out.println(name.replace("nav", ""));

        System.out.println(name.startsWith("Ab"));
        System.out.println(name.endsWith("av"));

        System.out.println(name.charAt(3));

        String modifiedName = "Abhinavnavnav";
        System.out.println(modifiedName.indexOf("nav"));
        System.out.println(modifiedName.indexOf("nav", 3));
        System.out.println(modifiedName.lastIndexOf("nav", 7));

        System.out.println(name.equals("Abhinav"));
        System.out.println(name.equalsIgnoreCase("ABhiNav"));

        System.out.println("I am escape sequence\ttab space\n line space \\ backslash\"double quote");
    }

}
