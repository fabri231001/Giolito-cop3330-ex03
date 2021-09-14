/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String q;
        String n;
        System.out.println("What is the quote? ");
        Scanner qu = new Scanner(System.in);
        q = qu.nextLine();
        System.out.println("Who said it?");
        Scanner na = new Scanner(System.in);
        n = na.nextLine();
        System.out.println(n + " says, \"" + q + "\"");

    }
}
