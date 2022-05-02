package com.company.chapter05;

import java.util.Scanner;

public class Number3 {

    public static int n, m;
    public static int[][] graph;
    public static boolean[][] visitedMap;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        scanner.nextLine(); // 버퍼 지우기
        graph = new int[n][m];
        visitedMap = new boolean[n][m];


        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
                visitedMap[i][j] = false;
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                if(dfs(i,j)){
                    count++;
                }
            }
        }


        System.out.println(count);
    }

    public static boolean dfs(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= m || graph[x][y] == 1 || visitedMap[x][y] == true){
            return false;
        }

        if(graph[x][y] == 0 && visitedMap[x][y] == false){
            visitedMap[x][y] = true;
            dfs(x-1, y);
            dfs(x+1,y);
            dfs(x, y-1);
            dfs(x,y+1);

            return true;
        }

        return false;


    }
}
