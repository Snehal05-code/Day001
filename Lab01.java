package LabAll.Lab01;

import java.util.Scanner;

//Datatype,Variable,Operation,Control statement
public class Lab01 {
    public static void main(String[] args) {
        System.out.println("hello world");
        //Datatype,Variable
        int a=10,b=5;
        double c=a+b;
        System.out.println("c=a+b "+c);
        //Datatype,Variable,Operation
        c=c+150;
        System.out.println("c+150 ="+c);
        //Datatype,Variable,Operation
        char cc = (char) c;
        System.out.println("CC = "+cc);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input::");
        int i = scanner. nextInt();
        //Control Statement
        if(i<=0)
        {
            System.out.println("NULL SYSTEM");
        }
        else
        {
            System.out.println("INPUT = "+i);
        }

        // Logic for factorial

        if(i==0)
        {
            System.out.println("Factorial is 1");
        }
        else
        {
            double fact = 1;
            while (i!=0)
            {
                System.out.println("Iterations="+i);
                System.out.println(fact+" = "+fact+" * "+i);
                fact=fact*i;
                System.out.println(fact+" = "+fact+" * "+i);
                i--;
                System.out.println("Post I = "+i);
            }
            System.out.println("FACTORIAL = "+fact);
        }
    }
}
