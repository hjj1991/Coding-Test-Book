package com.company.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr);
        int target = 1;
        for(int i = 0; i < arr.length; i++){
            if(target < arr[i]){
                break;
            }
            target = target + arr[i];
        }

        System.out.println(target);
    }
}
