package com.company;

public class Student {
    int rollNumber;
    String studentName;
    static String college = "\"UPTU\"";

    //constructor
    Student(int number, String Name){
        rollNumber = number;
        studentName = Name;
    }

    public String display(){
        String result = "RollNumber : " + rollNumber + "\n"
                    + "Name : " + studentName + "\n"
                    + "college : " + college
                    + "\n";
//        System.out.println(result);
        return result;
    }
}
