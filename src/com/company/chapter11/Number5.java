package com.company.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());


        stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i = 0; stk.hasMoreTokens();i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int choiceWeight = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(choiceWeight != arr[j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
