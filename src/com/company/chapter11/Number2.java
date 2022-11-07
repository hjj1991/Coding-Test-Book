package com.company.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine = br.readLine();

        int result = Integer.parseInt(readLine.substring(0, 1));
        for(int i = 1; i < readLine.length(); i++){
            int plus = result + Integer.parseInt(readLine.substring(i, i+1));
            int multiple = result * Integer.parseInt(readLine.substring(i, i+1));

            result = Math.max(plus, multiple);
        }

        System.out.println(result);


    }
}
