package utils;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        //Creating Scanner class object
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number: ");
        //Reading values from user
        int num=scan.nextInt();
        //Method calling
        findEvenOdd(num);
    }

    //User defined method
    private static void findEvenOdd(int num) {
        //method body
        if(num%2==0)
            System.out.println(num+ " is even");
        else
            System.out.println(num+ " is odd");
    }
}
