package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //System.out.println("hej");
        System.out.print("Skriv in en siffra: ");
        Scanner input1 = new Scanner(System.in);
        float xvalue = input1.nextFloat();
        System.out.print("Skriv in en siffra till: ");
        Scanner input2 = new Scanner(System.in);
        float yvalue = input2.nextFloat();
        System.out.print("Välj uträkningsmetod med hjälp av +, -, * eller /: ");
        Scanner input3 = new Scanner(System.in);
        char tecken = input3.next().charAt(0);

        switch (tecken){
            case '/':
            dividedBy delat = new dividedBy();
            System.out.println("Svaret är " + delat.divided(xvalue, yvalue));
            break;

        case '+':
            add adderat = new add();
            System.out.println("Svaret är " + adderat.add(xvalue, yvalue));
            break;


        case '*':
            Subtract subtract = new Subtract();
            System.out.println("Svaret är " + subtract.Subtract(xvalue, yvalue));
            break;
        }

        /*Newfunction newfunction = new Newfunction();
        newfunction.Newfunction(xvalue,yvalue);*/
    }
}
