package BaiTap;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Nhap so chia");
                int soChia = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so bi chia");
                int soBiChia = Integer.parseInt(scanner.nextLine());
                int result = soChia/soBiChia;
                System.out.println("result " + result);
                break;

            }catch (ArithmeticException e){
                System.err.println("So Bi chia != 0");
            }catch (NumberFormatException e){
                System.err.println("Invalid input ");
            }catch(Exception e){
                System.err.println("Loi he thong");
            }
        }
    }
}
