package BaiThucHanhSo1;

import java.util.Scanner;

public class _01_max3 {
	static int max3_1(int a, int b, int c) {
		if(a>=b && a>=c) return a;
		else if(b>=c) return b;
		else return c;
	}
	
	static int max3_2(int a, int b, int c) {
		return (a>=b && a>=c) ? a : ((b>=c) ? b : c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 3 số nguyên: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = max3_1(a, b, c);
		System.out.println("Số lớn nhất trong 3 số vừa nhập là: " + max);
		max = max3_2(a, b, c);
		System.out.println("Số lớn nhất trong 3 số vừa nhập là: " + max);
		sc.close();
	}
}
