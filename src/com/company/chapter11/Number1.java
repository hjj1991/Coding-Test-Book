package com.company.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int totalCount = 0;
        int groupCount = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            groupCount++;
            if(groupCount >= arr[i]){
                totalCount++;
                groupCount = 0;
            }
        }
        System.out.println(totalCount);
    }
}
