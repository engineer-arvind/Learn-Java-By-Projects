package com.project;

import java.io.PrintWriter;

public class Writer{
    public static void main(String[] args){
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("this is writer project");
    }
}