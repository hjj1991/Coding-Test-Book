package com.company.chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Number5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] d = new int[m+1];
        Arrays.fill(d, 10001);

        d[0] = 0;

        for(int i = 0; i < n; i++){
            for(int j = arr[i]; j <= m ; j++){
                d[j] = Math.min(d[j], d[j-arr[i]] + 1);
            }
        }

        if(d[m] != 10001){
            System.out.println(d[m]);
        }else{
            System.out.println(-1);
        }






    }
}
