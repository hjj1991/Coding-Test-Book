package com.company.gridy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chapter03 {

    /* 2번문제 큰수의 법칙 */
    public void rawOfLargeNumbers(){
        int arrSize;        //배열의 크기
        int plusLoop;       //숫자가 더해지는 횟수
        int plusOverride;   //중복 가능한 횟수
        int sum = 0;        //총 합

        Scanner scanner = new Scanner(System.in);
        arrSize = scanner.nextInt();
        plusLoop = scanner.nextInt();
        plusOverride = scanner.nextInt();

        List<Integer> intArr = new ArrayList<>();
        for(int i = 0; i < arrSize; i++){
            intArr.add(scanner.nextInt());
        }

        int firstMax = intArr.stream().max(Integer::compareTo).get();
        intArr.remove(intArr.indexOf(firstMax));
        int secondMax = intArr.stream().max(Integer::compareTo).get();

        int loop = 0;
        int count = 0;

        while(loop < plusLoop){
            if(count >= plusOverride){
                sum += secondMax;
                count = 0;
            }else{
                sum += firstMax;
                count++;
            }
            loop++;
        }

        System.out.println(sum);

    }

    /* 3번문제 숫자 카드 게임 */
    public void numberCardGame() {

        int n;  //행
        int m;  //열
        int min = 0;
        int minIndx = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            Arrays.sort(arr[i]);
            if(min < arr[i][0]){
                min = arr[i][0];
                minIndx = i;
            }
        }

        System.out.println(arr[minIndx][0]);

    }

    /* 4번문제 1이 될 때까지 */
    public void oneToFinal(){

        int n;
        int k;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        k = scanner.nextInt();

        while(n != 1){
            if(n % k == 0){
                n = n / k;
            }else{
                n -= 1;
            }
            count++;
        }

        System.out.println(count);

    }
}
