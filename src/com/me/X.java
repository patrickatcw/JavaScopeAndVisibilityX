package com.me;

import java.util.Scanner;

//step 1 create class
public class X {

    //step 2 field / variable
    private int x;

    //step 3 constructor
    /*public X(int x) {
        this.x = x;
    }*/

    //step 8 bonus
    //change the above to....
    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();

        //step 9 to main
    }

    //step 4 method
    public void x(){
        for (int x = 1; x < 13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
            //step 5 to main
        }
    }

}
