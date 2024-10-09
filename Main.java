import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to our Student Grade Tracker programme<> ");
        System.out.println("Please Enter Your Number of Students' Grades : ");
        int num = in.nextInt();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i <num; i++) {
            System.out.print("Enter Your  Students' Grades of student number : "+(i+1));
            System.out.println();
            grades.add(in.nextInt());
        }
        int operator=0;
        while (operator!=5) {
            System.out.println("##choose number of { 1,2,3,4,5 } : for operation you want ");
            System.out.println("1- for Calculate Average for this Grades");
            System.out.println("2- Give you The Highest degree from this Grades ");
            System.out.println("3- Give you The Lowest degree from this Grades ");
            System.out.println("4- IF you want to add any more Degrees ");
            System.out.println("5- Exit the Program");
            operator = in.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("Your average grade is : " + Calc_Average(grades));
                    break;
                case 2:
                    System.out.println("Student's Highest degree is : " + Highest_degree(grades));
                    break;
                case 3:
                    System.out.println("Student's Lowest degree is : " + lowest_degree(grades));
                    break;
                case 4:
                    add_degree(grades);
                    break;
                case 5:
                    System.out.println("Goodbye, pleased to help you.");
                    break;
                default:
                    System.out.println("You entered an invalid choice!");
            }
        }
    }
    public static double Calc_Average(ArrayList<Integer> grades) {
    int sum = 0;
        double res = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum+=grades.get(i);
        }
        res = (double) sum /grades.size();
        return res;
    }
    public static long Highest_degree(ArrayList<Integer> grades) {
        int highest = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
        }
        return highest;
    }
    public static long lowest_degree(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }
        return lowest;
    }
    public static void add_degree( ArrayList<Integer> grades) {
        System.out.println("Enter the Degree of student you need to add : ");
        int degree;
        degree=in.nextInt();
        grades.add(degree);
        System.out.println("Added Successfully </>");
    }
}