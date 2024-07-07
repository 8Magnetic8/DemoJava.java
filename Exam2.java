/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arraytest;

/**
 *
 * @author com4936
 */
public class Exam2 {

    public static void main(String[] args) {
//        int x = plusNumber(599,855);
//        System.out.print(x);
        //int result = computeNumber(5,4,'+');
        // System.out.print(result);
        //System.out.print(computeNumber(5,4,'+'));
        //show1ToN();
        // showAtoN();
        //showMul(3);
//        showAtoN(1,5);
////showevenNumber(1,29);
        showsumNumber(1, 30, 10);
    }

    public static int plusNumber(int num1, int num2) {
//        int answer = num1+num2;;    
//        //System.out.print(answer);
//        return answer;
        return num1 + num2;
    }

    public static int computeNumber(int num1, int num2, char opt) {
        int answer = 0;
        switch (opt) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return 0;
    }

    public static String getProgramName() {
        int programCode = 63;
        if (programCode == 13) {
            return "Infomation Tecnology";
        } else {
            return "Computer Science";
        }
    }

    public static void show1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }

    }

    public static void showAtoN() {
        for (char i = 'a'; i <= 'n'; i++) {
            System.out.print(i);
        }
    }

    public static void showMul(int n) {//multiplication Table
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + "x" + i + "=" + (i * n));
        }
    }

    public static int showAtoN(int a, int n) {
        int sum = 0;
        for (int i = a; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return 0;
    }

    public static void showevenNumber(int a, int n) {
        for (int i = a; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void showsumNumber(int a,int n,int x)
    {  
      int count = 0;
      for(int i = a; i<= n; i++)
       {
        if(i % 2 == 0 && i % x == 0)
        {
            count++;
            System.out.println(i);
        }
       }         
    }
}
