package Study.Baekjoon.Group_HW.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_10972 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if (permutation(arr)) {
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i] + " ");
			}
		} else
			System.out.println(-1);
	}



	static boolean permutation(int[] arr) {
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i])
			i--;
		if (i <= 0) {
			return false;
		}
		int j = arr.length - 1;
		while (arr[j - 1] >= arr[j])
			j--;
		swap(i - 1, j, arr);
		j = arr.length - 1;
		while (i < j) {
			swap(i, j, arr);
			i++;
			j--;
		}
		return true;
	}

	static void swap(int i, int j, int[] arr) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
