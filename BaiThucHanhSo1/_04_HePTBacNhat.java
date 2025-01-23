package BaiThucHanhSo1;

import java.util.Scanner;

public class _04_HePTBacNhat {
//	Phuong phap cong
    static void HePTBacNhat_1(float a, float b, float c, float a1, float b1, float c1) {
        float epsilon = 1e-6f;
        
        if (Math.abs(a / a1 - b / b1) < epsilon) {
            if (Math.abs(c / c1 - b / b1) < epsilon) {
                System.out.println("Hệ phương trình vô số nghiệm");
            } else {
                System.out.println("Hệ phương trình vô nghiệm");
            }
        } else {
            float x, y;
            
            if (a != 0 && a1 != 0) {
                float factor = a1 / a;
                float new_b1 = b1 - factor * b;
                float new_c1 = c1 - factor * c;

                if (new_b1 == 0) {
                    if (new_c1 == 0) {
                        System.out.println("Hệ phương trình vô số nghiệm");
                    } else {
                        System.out.println("Hệ phương trình vô nghiệm");
                    }
                } else {
                    y = new_c1 / new_b1;
                    x = (c - b * y) / a;
                    System.out.println("Nghiệm của hệ phương trình là:");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ.");
            }
        }
    }
    
// Phuong phap ma tran
    static void HePTBacNhat_2(float a, float b, float c, float a1, float b1, float c1) {
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập hệ số của phương trình 1 (a, b, c): ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.println("Nhập hệ số của phương trình 2 (a1, b1, c1): ");
        float a1 = sc.nextFloat();
        float b1 = sc.nextFloat();
        float c1 = sc.nextFloat();

        HePTBacNhat_1(a, b, c, a1, b1, c1);
        sc.close();
    }
}
