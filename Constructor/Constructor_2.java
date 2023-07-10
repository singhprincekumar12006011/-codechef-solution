/*
 
Create a class called Rectangle with instance variables length and width. 
Implement a parameterized constructor that accepts values for length and width and initializes the instance variables.
Add a method called calculateArea() that calculates and returns the area of the rectangle.
Create an object of the Rectangle class and display its area.

 */


import java.util.Scanner;
public class Constructor_2 {
    public static void main(String[] args) {
        int len;
        int brea;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        len = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        brea = sc.nextInt();
        
        Rectangle rec = new Rectangle(len, brea);
        int ar = rec.area();
        System.out.println("Area of rectangle is  = " + ar );
    }
    
}

class Rectangle
{
    int length;
    int breadth;

    //Creating parametrized constructor.
    public Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    public int area()
    {
        return length*breadth;
    }
    
}
