package BaiTap;

import java.util.Scanner;

public class BaiTap10 {
    private static final float PI = 3.14f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("Xin moi nhap ban kinh");

                float banKinh = Float.parseFloat(scanner.nextLine());

                if (banKinh <= 0) {
                    System.out.println("Ban Kinh must greater than 0 ");

                } else {
                    double result = Math.round(PI*Math.pow(banKinh,2));
                    System.out.println("Result " + result);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input invalid");
            }
        }
    }
}
