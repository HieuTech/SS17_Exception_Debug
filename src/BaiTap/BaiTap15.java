package BaiTap;

import java.util.Scanner;

public class BaiTap15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true){
           try{
               System.out.println("Xin moi nhap 3 canh tam giac");
               System.out.println("Xin moi nhap  canh 1 tam giac");
               int canh1 = Integer.parseInt(scanner.nextLine());
               System.out.println("Xin moi nhap  canh 2 tam giac");
               int canh2 = Integer.parseInt(scanner.nextLine());
               System.out.println("Xin moi nhap  canh 3 tam giac");
               int canh3 = Integer.parseInt(scanner.nextLine());

                checkTriangle(canh3,canh1,canh2);
               System.out.printf("3 canh %d, %d, %d la 3 canh cua 1 tam giac ",canh2,canh3,canh1);

           }catch (NumberFormatException e){
               System.out.println("input invalid");
           } catch (IllegalTriangleException e) {
               throw new RuntimeException(e);
           }
       }

    }
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if((a == 0 || b == 0 || c == 0) ||
                (a+b < c || a+c <b || b+c < a) ){
            throw new IllegalTriangleException("Error");
        }

    }
}
