package chapterFourExercises;
/*(Find the Largest Number) The process of finding the largest value is used frequently in computer
applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines
and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.*/

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number;
        int largestNumber = 0;
        int secondLargestNumber = 0;
        System.out.print("Enter a set of ten numbers:");
        while (count < 10) {
            number = input.nextInt();
            if (number > largestNumber) largestNumber = number;
            if (number < largestNumber && number > secondLargestNumber) secondLargestNumber = number;
            count++;
        }
        System.out.println(largestNumber);
        System.out.println(secondLargestNumber);
    }
}