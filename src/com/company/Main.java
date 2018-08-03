package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        int xvalue = input1.nextInt();
        int yvalue = input2.nextInt();
        /*Integer.parseInt(input1.nextLine());
        Integer.parseInt(input2.nextLine());*/
        dividedBy delat = new dividedBy();
        delat.divided(xvalue, yvalue);

        add adderat = new add();
        adderat.add(xvalue, yvalue);

        Subtract subtract = new Subtract();
        subtract.Subtract(xvalue,yvalue);

    }
}
