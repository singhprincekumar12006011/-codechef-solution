/* 

Create a class called Student with instance variables name, rollNumber, and grade. 
Implement a parameterized constructor that accepts values for name, rollNumber, and grade and initializes the instance variables. 
Create an array of Student objects, initialize them using the constructor, and display the details of all the students.
Take the detatil from user.


 */ 
 
import java.util.Scanner;

public class Constructor_4 {
    public static void main(String[] args) {
        String nam1, nam2, nam3;
        int roll1, roll2, roll3;
        int sco1, sco2, sco3;

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the first student:");
        nam1 = sc.nextLine();
        System.out.println("Enter the name of the second student:");
        nam2 = sc.nextLine();
        System.out.println("Enter the name of the third student:");
        nam3 = sc.nextLine();
        System.out.println("Enter the roll number of the first student:");
        roll1 = sc.nextInt();
        System.out.println("Enter the roll number of the second student:");
        roll2 = sc.nextInt();
        System.out.println("Enter the roll number of the third student:");
        roll3 = sc.nextInt();
        System.out.println("Enter the score of the first student:");
        sco1 = sc.nextInt();
        System.out.println("Enter the score of the second student:");
        sco2 = sc.nextInt();
        System.out.println("Enter the score of the third student:");
        sco3 = sc.nextInt();

        Students[] student = new Students[3];
        // Assigning the values to the array
        student[0] = new Students(nam1, roll1, sco1);
        student[1] = new Students(nam2, roll2, sco2);
        student[2] = new Students(nam3, roll3, sco3);

        // Printing the values
        System.out.println("Student Details:");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Name: " + student[i].name);
            System.out.println("Roll Number: " + student[i].rollNumber);
            System.out.println("Score: " + student[i].scores);
            System.out.println();
        }
    }
}

class Students {
    String name;
    int rollNumber;
    int scores;

    // Creating constructor
    public Students(String nam, int roll, int score) {
        name = nam;
        rollNumber = roll;
        scores = score;
    }
}
