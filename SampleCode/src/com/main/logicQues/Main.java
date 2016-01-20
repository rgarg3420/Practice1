package com.main.logicQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	 
	final int INF = 1000000000;
	final int MAXN = 100 + 5;
	final double EPS = 1e-7;
	final int MODULO = 1000000007;
	
	Scanner input = new Scanner(System.in);
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(System.out);
	StringTokenizer ST;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		
		new Main().run();
	}
 
	void run() throws IOException {
		int N, M;
		ST = new StringTokenizer(inp.readLine());
		N = Integer.parseInt((String)ST.nextElement());
		M = Integer.parseInt((String)ST.nextElement());
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = Integer.parseInt(inp.readLine());			
		}
		int[] steps = new int[N];
		int[] ways = new int[N];
		steps[N - 1] = 0;
		ways[N - 1] = 1;
		int k, m;
		k = m = N - 1;
		int sumWays = 0;
		int dist = 0;
		for (int i = N - 2; i >= 0; --i) {
			dist += a[i + 1] - a[i];
			while (dist > M) {
				dist -= a[k] - a[k - 1];
				sumWays -= ways[k];
				if (sumWays < 0) {
					sumWays += MODULO;
				}
				--k;
			}
			steps[i] = steps[k] + 1;
			while (steps[i] > steps[m]) {
				sumWays += ways[m];
				if (sumWays > MODULO) {
					sumWays -= MODULO;
				}
				--m;
			}
			ways[i] = sumWays;
		}
		out.println(steps[0] - 1 + "\n" + ways[0]);
		out.close();
	}
} 