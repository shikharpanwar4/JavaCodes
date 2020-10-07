package qwerty;

import java.util.Scanner;

public class main{

	public static void main(String[] args) {

		int n, k;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		k = scn.nextInt();
		int[] d = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			d[i] = scn.nextInt();
		}
		double ans = helper(s, d, n, k);
		System.out.println((int)Math.ceil(ans));
	}

	public static double covid(int[] s, int[] d, int n, int k, float rat, int curr, int index, double[][][] dp) {
		if (k <= 0) {
			return 0;
		}
		if (curr == n) {
			return Integer.MAX_VALUE;
		}
		if (dp[curr][index][k] != -1) {
			return dp[curr][index][k];
		}
		double ans = 0, ans2 = Integer.MAX_VALUE;
		double ans1 = covid(s, d, n, k, rat, curr + 1, index, dp);
		if (rat == -1) {
			ans2 = covid(s, d, n, k - 1, (float) d[curr] / s[curr], curr + 1, curr, dp) + d[curr];
		} else if (rat * s[curr] >= d[curr]) {
			ans2 = covid(s, d, n, k - 1, rat, curr + 1, index, dp) + rat * s[curr];
		}
		ans = Math.min(ans2, ans1);
		dp[curr][index][k] = ans;
		return ans;
	}

	public static double helper(int[] s, int[] d, int n, int k) {

		double[][][] dp = new double[n + 1][n + 1][k + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int l = 0; l <= k; l++) {
					dp[i][j][l] = -1;
				}
			}
		}
		double ans = covid(s, d, n, k, -1, 0, 0, dp);
		return ans;
	}

}