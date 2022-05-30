package com.company.chapter08;

import java.util.Scanner;

public class Number3 {

    public static int[] d = new int[100];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }


        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++){
            d[i] = Math.max(d[i-2] + arr[i], d[i-1]);
        }

        System.out.println(d[n-1]);

    }
}
