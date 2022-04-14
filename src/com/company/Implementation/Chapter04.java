package com.company.Implementation;

import java.util.Scanner;

public class Chapter04 {

    public void time(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i = 1; i <= (n +1) * 3600; i++){
            int hour = i / 3600;
            int minute = i % 3600 / 60;
            int seconds = i % 3600 % 60;
            if((String.valueOf(hour) + minute + seconds).contains("3")){
                count++;
            }
        }
        System.out.println(count);
    }

    public void royalNight() {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
