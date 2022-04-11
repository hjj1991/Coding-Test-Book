package com.company.gridy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter03 {

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
}
