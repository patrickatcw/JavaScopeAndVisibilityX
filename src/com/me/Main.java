package com.me;
/*
directions;
- write a small program to read an integer from the keyboard using scanner and print out
the times table for that number, the table should run from 1 to 12
- you are allowed to use one variable called scanner for your scanner instance
- you can use as many other variables as you need, but they must all be called x,
which includes any class instances and loop control variables that you may decide
to use
- if you use a class, the class can be called X (capital), but any instances of it must
be called x (lower case)
- any methods you create must also be called x
- bonus;
change your program so that ALL  variables (including the scanner instance) are
called x
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //step 5 do scanner for input by user
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        //step 6 instance
        X x = new X(scanner.nextInt());

        //step 7 call method
        x.x();*/  //then run

        /*Please enter a number:
        3
        1 times 3 equals 3
        2 times 3 equals 6
        3 times 3 equals 9
        4 times 3 equals 12
        5 times 3 equals 15
        6 times 3 equals 18
        7 times 3 equals 21
        8 times 3 equals 24
        9 times 3 equals 27
        10 times 3 equals 30
        11 times 3 equals 33
        12 times 3 equals 36*/

        //step 8 in X class for bonus

        //step 9
        X x = new X(new Scanner(System.in));
        x.x(); //then run, got same!

    }

}
