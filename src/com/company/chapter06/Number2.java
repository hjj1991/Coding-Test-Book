package com.company.chapter06;

import java.util.Scanner;


public class Number2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while(left < right){

            while(arr[pivot] > arr[left] && left <= end){
                left++;
            }
            while (arr[pivot] < arr[right] && start <= right){
                right--;
            }

            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);

    }
}
