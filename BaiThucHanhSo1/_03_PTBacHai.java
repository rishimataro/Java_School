package BaiThucHanhSo1;

import java.util.Scanner;

public class _03_PTBacHai {
	static void PTBacHai(float a, float b, float c) {
		float denta = b*b - 4*a*c;
		if(denta < 0) System.out.println("Phương trình vô nghiệm");
		else if(denta == 0) System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (-b/(2*a)));
		else {
			float x1 = (float)(-b + Math.sqrt(denta))/(2*a); // Math.sqrt(denta) trả về double nên cần ép kiểu
			float x2 = (float)(-b - Math.sqrt(denta))/(2*a);
			System.out.println("Phương trình có 2 nghiệm phân biệt: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a, b, c của PT a^2x + bx + c: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		PTBacHai(a, b, c);
		sc.close();
	}

}
