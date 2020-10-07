package qwerty;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n, s, q, e;
        n = sc.nextInt();
        s = sc.nextInt();
        q = sc.nextInt();
        e = sc.nextInt();

        int [][] edges = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                edges[i][j] = 0;
            }
        }

        for(int i=0; i<n-1; i++){
            int st, en, wt;
            st = sc.nextInt();
            en = sc.nextInt();
            wt = sc.nextInt();
            edges[st-1][en-1] = wt;
            edges[en-1][st-1] = wt;
        }

        boolean extra[] = new boolean[n];
        for(int i=0; i<n; i++){
            extra[i] = false;
        }

        for(int i=0; i<s; i++){
            int ex;
            ex = sc.nextInt();
            extra[ex-1] = true;
        }
        System.out.println("");
        while(q-->0){
            int I, R;
            I = sc.nextInt();
            R = sc.nextInt();
            int[][] edges1 = new int[n][n];
            for(int i=0; i<n; i++){
                edges1[i] = new int[n];
                for(int j=0; j<n; j++){
                    edges1[i][j] = edges[i][j];
                }
            }
            edges1[I-1][I] = 0;
            edges1[I][I-1] = 0;

            boolean[] visited = new boolean[n];
            for(int i=0; i<n; i++){
                visited[i] = false;
            }
            if(dfs(edges1, n, R-1, visited, e-1)){

                System.out.println("escaped");
                continue;
            }
            else{
                boolean[] visited1 = new boolean[n];
                for(int i=0; i<n; i++){
                    visited1[i] = false;
                }

                int ans = 10000000;
                for(int i=0; i<n; i++){
                    if(!extra[i]){
                        continue;
                    }
                    for(int j=0; j<n; j++){
                        visited1[j] = false;
                    }
                    int temp = dfs1(edges1, n, R-1, visited1, i);
                    if(temp<ans){
                        ans = temp;
                    }
                }
                if(ans==10000000){

                    System.out.println("oo");
                    continue;
                }
                else{

                    System.out.println(ans);

                }
            }
        }
    }

    static boolean dfs(int [][]edges, int n, int st, boolean[] visited, int e){
        visited[st] = true;
        if(st==e){
            return true;
        }

        if(st==0){
            if(!visited[st+1] && edges[st][st+1]!=0)
                return dfs(edges, n, st+1, visited, e);
        }
        else if(st==n-1){
            if(!visited[st-1] && edges[st][st-1]!=0)
                return dfs(edges, n, st-1, visited, e);
        }
        else{
            boolean op1 = false;
            boolean op2 = false;
            if(!visited[st+1] && edges[st][st+1]!=0)
                op1 = dfs(edges, n, st+1, visited, e);
            if(!visited[st-1] && edges[st][st-1]!=0)
                op2 = dfs(edges, n, st-1, visited, e);
            return op1|op2;
        }

        return false;
    }

    static int dfs1(int[][]edges1, int n, int st, boolean[] visited1, int e){
        visited1[st] = true;
        if(st==e){
            return 0;
        }

        if(st==0){
            if(!visited1[st+1] && edges1[st][st+1]!=0)
                return edges1[st][st+1] + dfs1(edges1, n, st+1, visited1, e);
        }
        else if(st==n-1){
            if(!visited1[st-1] && edges1[st][st-1]!=0)
                return edges1[st][st-1] + dfs1(edges1, n, st-1, visited1, e);
        }
        else{
            int op1 = 90000000;
            int op2 = 90000000;
            if(!visited1[st+1] && edges1[st][st+1]!=0)
                op1 = edges1[st][st+1] + dfs1(edges1, n, st+1, visited1, e);
            if(!visited1[st-1] && edges1[st][st-1]!=0)
                op2 = edges1[st][st-1] + dfs1(edges1, n, st-1, visited1, e);
            return Math.min(op1,op2);
        }

        return 90000000;
    }

}
