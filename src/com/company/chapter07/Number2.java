package com.company.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {

    public static boolean findValue(int[] tempArr, int start, int end, int target){

        if(start > end){
            return false;
        }

        int mid = (start + end) / 2;


        if(tempArr[mid] == target){
            return true;
        } else if (tempArr[mid] > target) {
            return findValue(tempArr, start, mid - 1, target);
        }else {
            return findValue(tempArr, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int findArr[] = new int[m];
        for(int i = 0; i < m; i++){
            findArr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);



        for (int i : findArr) {
            if(findValue(arr, 0, arr.length - 1, i)){
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }
}
