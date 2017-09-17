package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String[] cmd = {"pwd"};
        Process pb = null;
        String line = null;
        BufferedReader input = null;

        try {
            
            pb = Runtime.getRuntime().exec(cmd);
            input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
            PrintWriter writer = new PrintWriter("/home/anton/Downloads/the-file-name.txt", "UTF-8");

            while ((line = input.readLine()) != null) {
                writer.println(line);
                writer.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
