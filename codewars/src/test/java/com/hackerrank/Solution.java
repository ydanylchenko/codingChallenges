package com.hackerrank;

import java.util.Scanner;

public class Solution {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println(a);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String ans;
//        if (n % 2 == 1) {
//            ans = "Weird";
//        } else if (n < 6) {
//            ans = "Not Weird";
//        } else if (n < 21) {
//            ans = "Weird";
//        } else {
//            ans = "Not Weird";
//        }
//        System.out.println(ans);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

