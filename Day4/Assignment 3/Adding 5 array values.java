package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        System.out.println("enter the any Five Numbers");
        int element;
        for (element = 0; element< 5; element++)
        {
            numbers[element] =sc.nextInt();
        }
        for(int n : numbers)
        {
            sum= sum+n;
        }
        System.out.println("the Sum of entered Nubers is" + sum);

    }
}
