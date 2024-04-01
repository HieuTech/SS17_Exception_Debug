package BaiTap;

import java.util.Scanner;

public class BaiTap12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("Nhap so thu 1");
                int numb1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so thu 2");
                int numb2 = Integer.parseInt(scanner.nextLine());
                if (numb2 == 0 && numb1 == 0) {
                    throw new RuntimeException("input must greater than 0");
                }
                int UCLN = timUSCLN(numb1, numb2);
                System.out.println("result " + UCLN);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input invalid");
            }
        }
    }

    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

