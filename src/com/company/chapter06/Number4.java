package com.company.chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 두 배열의 원소 교체
 */
public class Number4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        sc.nextLine();

        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        // 배열 A는 오름차순 정렬 수행
        Arrays.sort(arr1);
        // 배열 B는 내림차순 정렬 수행
        Arrays.sort(arr2, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
        for (int i = 0; i < k; i++) {
            // A의 원소가 B의 원소보다 작은 경우
            if (arr1[i] < arr2[i]) {
                // 두 원소를 교체
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
            // A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }


        // 배열 A의 모든 원소의 합을 출력
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += arr1[i];
        }
        System.out.println(result);


    }
}
