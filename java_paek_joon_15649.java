package org.example;
import java.io.IOException;
import java.util.Scanner;
import java.lang.StringBuilder;


public class java_paek_joon_15649 {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
       Scanner scn =new Scanner(System.in);

        int N = scn.nextInt();
        int M = scn.nextInt();
        visit = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int idx){
        if(idx == M ){
            for(int elemnt : arr){
                sb.append(elemnt).append(' ');
            }
            sb.append('\n');
            return;

        }

        for(int i =0; i < N ;i++){
            if(!visit[i]){
                visit[i] = true;
                arr[idx] = i+1;
                dfs(N, M, idx +1);
                visit[i] = false;
            }

        }
    }
}
