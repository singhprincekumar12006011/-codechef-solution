/*
 
Create a class called Student with instance variables name, rollNumber, and grade. 
Implement a parameterized constructor that accepts values for name, rollNumber, and grade and initializes the instance variables. 
Create an array of Student objects, initialize them using the constructor, and display the details of all the students.

 */

class Student{
    String name;
    int rollNumber;
    int grades;
    //creating parametrized constructor
    public Student(String nam, int roll, int grade)
    {
        name = nam;
        rollNumber = roll;
        grades = grade;
    }
}
public class Constructor_3 {
    public static void main(String[] agrs)
    {
        //Creating an array student object
        Student[] student = new Student[3];

        //initializing the array using constructor
        student[0] = new Student("prince", 1, 70);
        student[1] = new Student("Tanu", 2, 56);
        student[2] = new Student("Manish", 3, 59);
        

        // Display the details of all the students
        System.out.println("Student Details:");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Name: " + student[i].name);
            System.out.println("Roll Number: " + student[i].rollNumber);
            System.out.println("Grade: " + student[i].grades);
            System.out.println();
        }

    }
    
}
