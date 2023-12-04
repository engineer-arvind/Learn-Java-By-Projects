package com.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateInput {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your first number ");
            int num1 = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter your second number ");
            int num2 = Integer.parseInt(bufferedReader.readLine());

            System.out.println("the output of the sum of num1 and num2 "+(num1 +num2));
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
