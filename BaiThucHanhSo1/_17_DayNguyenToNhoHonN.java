package BaiThucHanhSo1;

import java.util.ArrayList;

public class _17_DayNguyenToNhoHonN {
	static void sang(boolean[] ls, int n) {
		for (int i = 0; i < n; i++) ls[i] = true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(ls[i]) {
				for(int j = i*i; j < n; j+=i) {
					ls[j] = false;
				}
			}
		}
		for(int i = 2; i < n; i++) {
			if(ls[i]) System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		boolean[] ls = new boolean[100];
		sang(ls, 100);
		sang(ls, 50);
	}
}
