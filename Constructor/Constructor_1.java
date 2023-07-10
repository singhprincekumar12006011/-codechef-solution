/*
 
Write a Java class called Person with instance variables name and age. 
Implement a parameterized constructor that accepts values for name and age and initializes the instance variables. 
Create an object of the Person class and display the name and age of the person.

 */

import java.util.Scanner;
class person
{
    String name;
    int age ;

    //creating a Parameterized constructor
    public person(String n, int a)
    {
        name = n;
        age = a;
    }
}


public class Constructor_1
{
    public static void main(String[] args)
    {
        String x; 
        int y;
        System.out.println("Enter the name of person:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        System.out.println("enter the age of person");
        y = sc.nextInt();

        //Creating an object of class person.
        person per = new person(x, y);
        System.out.println("Name: " + per.name);
        System.out.println("Age: " + per.age);
    }
    
    
}