package com.company.chapter08;

import java.util.Scanner;

public class Number4 {

    public static int[] d = new int[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        d[1] = 1;
        d[2] = 3;

        for(int i = 3; i <= n; i++){

            d[i] = (d[i - 1] + 2 * d[i - 2]) % 796796;
        }

        // 계산된 결과 출력
        System.out.println(d[n]);

    }
}
