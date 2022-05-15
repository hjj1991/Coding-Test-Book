package com.company.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Number3 {

    public static int num;

    public static boolean findValue(int[] arr, int target, int start, int end) {

        if(start > end){
            return false;
        }
        int mid = (start + end) / 2;

        int sum = 0;
        for (int i : arr) {
            if(i > mid){
                sum += i - mid;
            }
        }

        if(sum == target){
            num = mid;
            return true;
        }else if(sum > target){
            return findValue(arr, target, mid + 1, end);
        }else{
            return findValue(arr, target, start, mid - 1);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int maxValue = arr[arr.length - 1];

        if(findValue(arr, m, 1, maxValue)){
            System.out.println(num);
        }





    }
}
