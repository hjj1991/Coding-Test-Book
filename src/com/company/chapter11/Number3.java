package com.company.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int zeroCount = 0;
        int oneCount = 0;

        if(s.charAt(0) - '0' == 0){
            oneCount++;
        }else{
            zeroCount++;
        }
        for (int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                if(s.charAt(i+1) - '0' == 1){
                    zeroCount++;
                }else{
                    oneCount++;
                }
            }
        }

        System.out.println(Math.min(zeroCount, oneCount));
    }
}
