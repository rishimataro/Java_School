package BaiThucHanhSo1;

public class _04_HePTBacNhat {
//	Phuong phap cong
    static void HePTBacNhat_1(float a, float b, float c, float a1, float b1, float c1) {
        float eps = 1e-6f;
        
        if (Math.abs(a / a1 - b / b1) < eps) {
            if (Math.abs(c / c1 - b / b1) < eps) {
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
                    System.out.println("x = " + x + ", y = " + y);
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ.");
            }
        }
    }
    
// Phuong phap ma tran
    static void HePTBacNhat_2(float a1, float b1, float c1, float a2, float b2, float c2) {
        double d = a1*b2 - a2*b1;
        double dx = c1*b2 - c2*b1;
        double dy = a1*c2 - a2*c1;
    	
    	if(d == 0) {
    		if(dx == 0 && dy == 0) {
    			System.out.println("Hệ phương trình vô số nghiệm");
    		}
    		else {
    			System.out.println("Hệ phương trình vô nghiệm");
    		}
    		
    	}
    	else {
    		double x = dx/d, y = dy/d;
            System.out.println("Nghiệm của hệ phương trình là:");
            System.out.println("x = " + x + ", y = " + y);
    	}
    }

    public static void main(String[] args) {
        HePTBacNhat_1(1, 2, 3, 3, -1, 4);
        HePTBacNhat_2(4, -2, 5, 6, 3, 7);

    }
}
