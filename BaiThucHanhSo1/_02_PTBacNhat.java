package BaiThucHanhSo1;

import java.util.Scanner;

public class _02_PTBacNhat {
	static void PTBacNhat(float a, float b) {
		if(a==0) {
			if(b==0) System.out.println("Phương trình vô số nghiệm");
			else System.out.println("Phương trình vô nghiệm");
		}
		else System.out.println("Phương trình có 1 nghiệm duy nhất là: " + -b/a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a, b của PT ax + b: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		PTBacNhat(a, b);
		sc.close();
	}
}
