package com.company.chapter06;

import java.util.Scanner;

/**
 * 실전문제
 * 3. 성적이 낮은 순서로 학생 출력하기
 */
public class Number3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] scoreNameArr = new String[101];

        int n = sc.nextInt();
        sc.nextLine();
        String arr[][] = new String[n][2];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine().split(" ");
        }

        for(int i = 0; i < arr.length; i++){
            if(scoreNameArr[Integer.parseInt(arr[i][1])] == null){
                scoreNameArr[Integer.parseInt(arr[i][1])] = arr[i][0];
            }else{
                scoreNameArr[Integer.parseInt(arr[i][1])] = scoreNameArr[Integer.parseInt(arr[i][1])] + " " + arr[i][0];
            }
        }

        for (String scoreName : scoreNameArr) {
            if(scoreName != null){
                System.out.print(scoreName + " ");
            }
        }


    }
}
