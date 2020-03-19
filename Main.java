package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Student records");
        System.out.println("===============");
        System.out.println();
        var student1 = new Student(100,"Sonia Pathak");
        var student2 = new Student(200,"Ajeet Tewari");
        var student3 = new Student(300,"Arun Tewari");
        System.out.println(student1.display());
        System.out.println(student2.display());
        System.out.println(student3.display());

    }
}
