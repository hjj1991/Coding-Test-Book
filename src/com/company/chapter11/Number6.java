package com.company.chapter11;

import java.util.Arrays;

public class Number6 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2}, 5));
    }


    public static int solution(int[] food_times, long k) {
        int currentFood = 0;

        long seconds = 0l;
        long arrCount = 0l;


        while (seconds <= k){
            if(currentFood > food_times.length-1){
                currentFood = 0;
                arrCount++;
            }

            if(food_times[currentFood] > 0){
                food_times[currentFood]--;
                arrCount = 0;
                seconds++;
            }else{
                arrCount++;
            }
            currentFood++;

            if(arrCount >= food_times.length-1){
                currentFood = -1;
                break;
            }

        }

        return currentFood;
    }
}
